package com.ccsw.calendarmanager.group;

import java.util.List;
import com.ccsw.calendarmanager.group.model.GroupDto;
import com.ccsw.calendarmanager.group.model.GroupEntity;

/**
 * @author lmbastant
 *
 */
public interface GroupService {
  
	List<GroupEntity> getAllGroups();

	GroupEntity getById(long id);
	
	GroupEntity createOrUpdate(GroupDto dto);
	
	/**
	   * @param id
	*/
	void deleteById(Long id);
}
