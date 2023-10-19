package com.ccsw.calendarmanager.group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccsw.calendarmanager.calendarday.model.CalendarDayDto;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;
import com.ccsw.calendarmanager.group.model.GroupDto;

/**
 * @author lbastant
 *
 */
@RequestMapping(value = "/group")
@RestController
public class GroupController {

  @Autowired
  GroupService groupService;

  @Autowired
  private BeanMapper beanMapper;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public List<GroupDto> get() {

    return this.beanMapper.mapList(this.groupService.getAllGroups(), GroupDto.class);
  }
  
  /**
   * @param groupId
   * @return group
   * 
   */
  
  @RequestMapping(path = "/{groupId}/", method = RequestMethod.GET)
  public GroupDto findById(@PathVariable("groupId") long groupId) {
    return this.beanMapper.map(this.groupService.getById(groupId), GroupDto.class);
  }


  
  /**
   * @param name
   * @param maxHourYear
   * @param hoursWeek
   * @param hoursF
   * @param hoursIntensive
   * @param intensiveFrom
   * @param intensiveTo
   * @param personalDays
   * @param freeDays
   * @param additionalDays
   * @param holidays
   * @return group
   * 
   */
  
  @RequestMapping(path = "/", method = RequestMethod.POST)
  public GroupDto save(@RequestBody GroupDto data) {

	  return this.beanMapper.map(this.groupService.createOrUpdate(data), GroupDto.class);
  }
  /**
   * @param id
   * @param name
   * @param maxHourYear
   * @param hoursWeek
   * @param hoursF
   * @param hoursIntensive
   * @param intensiveFrom
   * @param intensiveTo
   * @param personalDays
   * @param freeDays
   * @param additionalDays
   * @param holidays
   * @return group
   * 
   */
  @RequestMapping(path = "/", method = RequestMethod.PUT)
  public GroupDto update(@RequestBody GroupDto data) {
      return this.beanMapper.map(this.groupService.createOrUpdate(data), GroupDto.class);
  }
  
  
  /**
   * @param id
   */
  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
  public void deleteById(@PathVariable Long id)  {
      this.groupService.deleteById(id);
  }

}
