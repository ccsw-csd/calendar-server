package com.ccsw.calendarmanager.festiveday;

import java.util.List;

import com.ccsw.calendarmanager.festiveday.model.FestiveDayEntity;
import com.ccsw.calendarmanager.festiveday.model.FestiveDaySaveDto;

/**
 * @author lmbastant
 *
 */
public interface FestiveDayService {
  
	 /**
	   * @param year
	   * @param centerId
	   */
	
	List<FestiveDayEntity> findByYearAndCenterId(Integer year, Long centerId);
	
	void createOrUpdate(FestiveDaySaveDto data);
}
