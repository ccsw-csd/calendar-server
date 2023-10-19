package com.ccsw.calendarmanager.categoryday;

import java.util.List;

import com.ccsw.calendarmanager.categoryday.model.CategoryDayDto;
import com.ccsw.calendarmanager.categoryday.model.CategoryDayEntity;

/**
 * @author lmbastant
 *
 */
public interface CategoryDayService {
  
	List<CategoryDayEntity> getAllCategories();

	CategoryDayEntity getById(Integer id);
	
	  /**
	   * @param id
	   * @param name
	   * @param hours
	   */
	CategoryDayEntity createOrUpdate(CategoryDayDto dto);
	
	/**
	   * @param id
	*/
	void deleteById(Long id);
}
