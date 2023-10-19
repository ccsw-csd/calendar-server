package com.ccsw.calendarmanager.calendarday;

import java.util.List;

import com.ccsw.calendarmanager.calendarday.model.CalendarDayEntity;
import com.ccsw.calendarmanager.calendarday.model.CalendarDaySaveDto;

/**
 * @author lmbastant
 *
 */
public interface CalendarDayService {

	  /**
	   * @param year
	   * @param calendarId
	   */
	
	List<CalendarDayEntity> findByYearAndCalendarId(Integer year, Long calendarId);

	void createOrUpdate(CalendarDaySaveDto data);
	
}
