package com.ccsw.calendarmanager.calendar;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ccsw.calendarmanager.calendar.model.CalendarEntity;


/**
 * @author lmbastant
 *
 */
public interface CalendarRepository extends CrudRepository<CalendarEntity, Long> {
	List<CalendarEntity> findByCenterId(Long id);
	List<CalendarEntity> findByGroupId(Long id);
	
	/**
	  * @param id
	*/
	@Transactional
	void deleteAllByGroupId(Long id);
	
	/**
	  * @param id
	*/
	@Transactional
	void deleteAllByCenterId(Long id);
	
}
