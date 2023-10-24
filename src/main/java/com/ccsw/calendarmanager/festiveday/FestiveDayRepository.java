package com.ccsw.calendarmanager.festiveday;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.ccsw.calendarmanager.festiveday.model.FestiveDayEntity;

/**
 * @author lmbastant
 *
 */
public interface FestiveDayRepository extends CrudRepository<FestiveDayEntity, Long> {
	List<FestiveDayEntity> findByYearAndCenterId(Integer year, Long centerId);
	
	@Transactional
	Integer deleteByDateAndCenterId(String date, Long centerId);
  
}
