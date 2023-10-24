package com.ccsw.calendarmanager.festiveday;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsw.calendarmanager.calendar.model.CalendarEntity;
import com.ccsw.calendarmanager.calendarday.model.CalendarDayEntity;
import com.ccsw.calendarmanager.calendarday.model.CalendarDaySaveDto;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;
import com.ccsw.calendarmanager.festiveday.model.FestiveDayEntity;
import com.ccsw.calendarmanager.festiveday.model.FestiveDaySaveDto;
/**
 * @author lmbastant
 *
 */
@Service
public class FestiveDayServiceImpl implements FestiveDayService {

  @Autowired
  FestiveDayRepository festiveDayRepository;
  
  @Autowired
  private BeanMapper beanMapper;

  private static final Logger LOG = LoggerFactory.getLogger(FestiveDayServiceImpl.class);

  @Override
  public List<FestiveDayEntity> findByYearAndCenterId(Integer year, Long centerId) {
	  return this.festiveDayRepository.findByYearAndCenterId(year,centerId);
  }
  
  @Override
  public void createOrUpdate(FestiveDaySaveDto data) {
  	if (data.getData() != null) {
  		data.getData().forEach(element -> {
  			this.festiveDayRepository.deleteByDateAndCenterId(element.getDate(), element.getCenterId());
  		    FestiveDayEntity festiveDayEntity = new FestiveDayEntity();
  		    festiveDayEntity.setCenterId(element.getCenterId());
  			festiveDayEntity.setDate(element.getDate());
  			festiveDayEntity.setYear(Integer.parseInt(element.getDate().substring(0, 4)));
  			this.festiveDayRepository.save(festiveDayEntity);
  			

  		});

  	}
  	
  }
}
