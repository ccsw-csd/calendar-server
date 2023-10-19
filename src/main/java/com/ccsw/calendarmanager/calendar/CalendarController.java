package com.ccsw.calendarmanager.calendar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccsw.calendarmanager.calendar.model.CalendarDto;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;

/**
 * @author lbastant
 *
 */
@RequestMapping(value = "/calendar")
@RestController
public class CalendarController {

  @Autowired
  CalendarService calendarService;

  @Autowired
  private BeanMapper beanMapper;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public List<CalendarDto> get() {

    return this.beanMapper.mapList(this.calendarService.getAllCalendars(), CalendarDto.class);
  }
  
  /**
   * @param group Id
   * @param year
   * @return
   */
  @RequestMapping(path = "/{groupId}/", method = RequestMethod.GET)
  public List<CalendarDto> find(@PathVariable("groupId") long groupId) {

    return this.beanMapper.mapList(this.calendarService.getByGroupId(groupId), CalendarDto.class);
  }



}
