package com.ccsw.calendarmanager.calendarday;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ccsw.calendarmanager.calendarday.model.CalendarDayEntity;
import com.ccsw.calendarmanager.calendarday.model.CalendarDayDto;

/**
 * @author lmbastant
 *
 */
public interface CalendarDayRepository extends CrudRepository<CalendarDayEntity, Long> {
	List<CalendarDayEntity> findByYearAndCalendarId(Integer year, Long calendarId);

	void save(CalendarDayDto element);

	@Transactional
	Integer deleteByDateAndCalendarId(String date, Long calendarId);
}
