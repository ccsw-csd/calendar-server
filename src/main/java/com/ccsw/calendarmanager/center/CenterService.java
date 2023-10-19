package com.ccsw.calendarmanager.center;

import java.util.List;

import com.ccsw.calendarmanager.center.model.CenterDto;
import com.ccsw.calendarmanager.center.model.CenterEntity;

/**
 * @author lmbastant
 *
 */
public interface CenterService {
  
	List<CenterEntity> getAllCenters();

	CenterEntity getById(Integer id);
	
	  /**
	   * @param id
	   * @param name
	   */
	CenterEntity createOrUpdate(CenterDto dto);
	
	/**
	   * @param id
	*/
	void deleteById(Long id);
}
