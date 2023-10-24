package com.ccsw.calendarmanager.group;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsw.calendarmanager.calendar.CalendarRepository;
import com.ccsw.calendarmanager.calendar.model.CalendarEntity;
import com.ccsw.calendarmanager.calendarday.CalendarDayRepository;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;
import com.ccsw.calendarmanager.group.model.GroupDto;
import com.ccsw.calendarmanager.group.model.GroupEntity;
/**
 * @author lmbastant
 *
 */
@Service
public class GroupServiceImpl implements GroupService {

  @Autowired
  GroupRepository groupRepository;
  
  @Autowired
  CalendarRepository calendarRepository;
  
  @Autowired
  CalendarDayRepository calendarDayRepository;
  
  @Autowired
  private BeanMapper beanMapper;

  private static final Logger LOG = LoggerFactory.getLogger(GroupServiceImpl.class);

  @Override
  public List<GroupEntity> getAllGroups() {

    Iterable<GroupEntity> groupEntities = this.groupRepository.findAll();
    List<GroupEntity> groupEntityList = new ArrayList<GroupEntity>();
    groupEntities.forEach(groupEntityList::add);

    return groupEntityList;
  }

  @Override
  public GroupEntity getById(long id) {

    return this.groupRepository.findById(id);
  }
  
  
  @Override
  public GroupEntity createOrUpdate(GroupDto dto) {
	GroupEntity group = new GroupEntity();
	if (dto.getId() != null) {
		group = groupRepository.findById(dto.getId()).orElse(null);
	//	this.groupRepository.deleteById(dto.getId());  
	}
	 group = this.beanMapper.map(dto, GroupEntity.class);
     this.groupRepository.save(group);
  //   group = groupRepository.findByName(group.getName());

     if (dto.getCentersSelected() != null && dto.getCentersSelected().size() > 0) {
    	 this.calendarRepository.deleteAllByGroupId(dto.getId());
    	 for (int i = 0; i < dto.getCentersSelected().size(); i++) {
    	      CalendarEntity calendar = new CalendarEntity();
    	      calendar.setCenterId(dto.getCentersSelected().get(i));
    	      calendar.setGroupId(group.getId());
    	      this.calendarRepository.save(calendar);
   
    	 }
 	}
     
    return group;
  }

  
  @Override
  public void deleteById(Long id) {
	  this.calendarRepository.deleteAllByGroupId(id);
	  this.groupRepository.deleteById(id);
  }
  
}
