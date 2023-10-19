package com.ccsw.calendarmanager.center;

import org.springframework.data.repository.CrudRepository;

import com.ccsw.calendarmanager.center.model.CenterEntity;

/**
 * @author lmbastant
 *
 */
public interface CenterRepository extends CrudRepository<CenterEntity, Long> {
  CenterEntity findById(Integer id);
  
  CenterEntity findByName(String name);
  
}
