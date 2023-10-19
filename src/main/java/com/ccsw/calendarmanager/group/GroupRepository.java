package com.ccsw.calendarmanager.group;

import org.springframework.data.repository.CrudRepository;
import com.ccsw.calendarmanager.group.model.GroupEntity;

/**
 * @author lmbastant
 *
 */
public interface GroupRepository extends CrudRepository<GroupEntity, Long> {
  GroupEntity findById(long id);
  GroupEntity findByName(String name);

}
