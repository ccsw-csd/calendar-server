package com.ccsw.calendarmanager.calendarday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.collections4.map.HashedMap;
import org.dom4j.dtd.ElementDecl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsw.calendarmanager.calendar.CalendarRepository;
import com.ccsw.calendarmanager.calendar.model.CalendarEntity;
import com.ccsw.calendarmanager.calendarday.model.CalendarDayEntity;
import com.ccsw.calendarmanager.calendarday.model.CalendarDaySaveDto;
import com.ccsw.calendarmanager.categoryday.CategoryDayRepository;
import com.ccsw.calendarmanager.center.model.CenterEntity;
/**
 * @author lmbastant
 *
 */
@Service
public class CalendarDayServiceImpl implements CalendarDayService {

  @Autowired
  CalendarDayRepository calendarDayRepository;
  
  @Autowired
  CategoryDayRepository categoryDayRepository;
  
  @Autowired
  CalendarRepository calendarRepository;

  private static final Logger LOG = LoggerFactory.getLogger(CalendarDayServiceImpl.class);

  @Override
  public List<CalendarDayEntity> findByYearAndCalendarId(Integer year, Long calendarId) {

    return this.calendarDayRepository.findByYearAndCalendarId(year,calendarId);
  }

@Override
public void createOrUpdate(CalendarDaySaveDto data) {
	if (data.getData() != null) {
		data.getData().forEach(element -> {
			this.calendarDayRepository.deleteByDateAndCalendarId(element.getDate(), element.getCalendarId());
			if (element.getCategoryId() == 1) {
				Optional<CalendarEntity> calendarFestive = this.calendarRepository.findById(element.getCalendarId());
				if (calendarFestive != null) {
					List<CalendarEntity> centersFestive =  this.calendarRepository.findByCenterId(calendarFestive.get().getCenterId());
					for (CalendarEntity c: centersFestive) {
						CalendarDayEntity calendarDayEntity = new CalendarDayEntity();
						calendarDayEntity.setCalendarId(c.getId());
						calendarDayEntity.setCategoryId(element.getCategoryId());
						calendarDayEntity.setDate(element.getDate());
						calendarDayEntity.setYear(Integer.parseInt(element.getDate().substring(0, 4)));
						this.calendarDayRepository.save(calendarDayEntity);
					}
				}
			
			} else if(element.getCategoryId() != 2) {
				CalendarDayEntity calendarDayEntity = new CalendarDayEntity();
				calendarDayEntity.setCalendarId(element.getCalendarId());
				calendarDayEntity.setCategoryId(element.getCategoryId());
				calendarDayEntity.setDate(element.getDate());
				calendarDayEntity.setYear(Integer.parseInt(element.getDate().substring(0, 4)));
				this.calendarDayRepository.save(calendarDayEntity);
				} 

		});

	}
	
}

 
}
