package com.ccsw.calendarmanager.center;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsw.calendarmanager.calendar.CalendarRepository;
import com.ccsw.calendarmanager.center.model.CenterDto;
import com.ccsw.calendarmanager.center.model.CenterEntity;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;
/**
 * @author lmbastant
 *
 */
@Service
public class CenterServiceImpl implements CenterService {

  @Autowired
  CenterRepository centerRepository;
  
  @Autowired
  CalendarRepository calendarRepository;
  
  @Autowired
  private BeanMapper beanMapper;

  private static final Logger LOG = LoggerFactory.getLogger(CenterServiceImpl.class);

  @Override
  public List<CenterEntity> getAllCenters() {

    Iterable<CenterEntity> centersEntities = this.centerRepository.findAll();
    List<CenterEntity> centerEntityList = new ArrayList<CenterEntity>();
    centersEntities.forEach(centerEntityList::add);

    return centerEntityList;
  }

  @Override
  public CenterEntity getById(Integer id) {

    return this.centerRepository.findById(id);
  }

  
  @Override
  public CenterEntity createOrUpdate(CenterDto dto) {
	  CenterEntity center = new CenterEntity();
		if (dto.getId() != null) {
			center = centerRepository.findById(dto.getId()).orElse(null);
		//	this.centerRepository.deleteById(dto.getId());  
		}
		 center = this.beanMapper.map(dto, CenterEntity.class);
	     this.centerRepository.save(center);
	//     center = centerRepository.findByName(center.getName());  
	  
    return center;
  }
  
  @Override
  public void deleteById(Long id) {
	  this.calendarRepository.deleteAllByCenterId(id);
	  this.centerRepository.deleteById(id);
  }

}
