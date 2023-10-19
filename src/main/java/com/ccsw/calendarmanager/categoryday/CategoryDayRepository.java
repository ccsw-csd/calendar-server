package com.ccsw.calendarmanager.categoryday;

import org.springframework.data.repository.CrudRepository;

import com.ccsw.calendarmanager.categoryday.model.CategoryDayEntity;

/**
 * @author lmbastant
 *
 */
public interface CategoryDayRepository extends CrudRepository<CategoryDayEntity, Long> {
  CategoryDayEntity findById(Integer id);
  
  CategoryDayEntity findByName(String name);
  
}
