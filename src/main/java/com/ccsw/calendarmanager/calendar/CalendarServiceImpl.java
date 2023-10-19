package com.ccsw.calendarmanager.calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsw.calendarmanager.calendar.model.CalendarDto;
import com.ccsw.calendarmanager.calendar.model.CalendarEntity;
import com.ccsw.calendarmanager.center.CenterRepository;
import com.ccsw.calendarmanager.center.model.CenterEntity;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;
import com.ccsw.calendarmanager.group.GroupRepository;
import com.ccsw.calendarmanager.group.model.GroupEntity;
/**
 * @author lmbastant
 *
 */
@Service
public class CalendarServiceImpl implements CalendarService {

  @Autowired
  CalendarRepository calendarRepository;
  
  @Autowired
  CenterRepository centerRepository;
  
  @Autowired
  GroupRepository groupRepository;
  
  @Autowired
  private BeanMapper beanMapper;

  private static final Logger LOG = LoggerFactory.getLogger(CalendarServiceImpl.class);

  @Override
  public List<CalendarDto> getAllCalendars() {

    Iterable<CenterEntity> centerEntities = this.centerRepository.findAll();
    Map<Long, String> mapCenter = new HashedMap<Long, String>();
    centerEntities.forEach(center -> mapCenter.put(center.getId(), center.getName()));

    Iterable<GroupEntity> groupEntities = this.groupRepository.findAll();
    Map<Long, String> mapGroup = new HashedMap<Long, String>();
    groupEntities.forEach(group -> mapGroup.put(group.getId(), group.getName()));
    
   
    Iterable<CalendarEntity> calendarEntities = this.calendarRepository.findAll();
    List<CalendarEntity> calendarEntityList = new ArrayList<CalendarEntity>();
    calendarEntities.forEach(calendarEntityList::add);
    List<CalendarDto> calendarsDto = new ArrayList<CalendarDto>();
    calendarsDto = this.beanMapper.mapList(calendarEntityList, CalendarDto.class);
    calendarsDto.forEach(calendar -> {
    									calendar.setCenterName(mapCenter.get(calendar.getCenterId()));
    									calendar.setGroupName(mapGroup.get(calendar.getGroupId()));
    								});

    

    return calendarsDto;
  }

@Override
public List<CalendarEntity> getByGroupId(Long id) {
	  Iterable<CalendarEntity> calendarEntities = this.calendarRepository.findByGroupId(id);
	  List<CalendarEntity> calendarEntityList = new ArrayList<CalendarEntity>();
	  calendarEntities.forEach(calendarEntityList::add);
	  return calendarEntityList;
}

  


}
