package com.ccsw.calendarmanager.calendar;

import java.util.List;

import com.ccsw.calendarmanager.calendar.model.CalendarDto;
import com.ccsw.calendarmanager.calendar.model.CalendarEntity;

/**
 * @author lmbastant
 *
 */
public interface CalendarService {
  
	List<CalendarDto> getAllCalendars();
	
	List<CalendarEntity> getByGroupId(Long id);

}
