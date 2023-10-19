package com.ccsw.calendarmanager.calendarday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ccsw.calendarmanager.calendarday.model.CalendarDayDto;
import com.ccsw.calendarmanager.calendarday.model.CalendarDaySaveDto;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;

/**
 * @author lbastant
 *
 */
@RequestMapping(value = "/days")
@RestController
public class CalendarDayController {

  @Autowired
  CalendarDayService calendarDayService;

  @Autowired
  private BeanMapper beanMapper;
  
  @RequestMapping(method = RequestMethod.GET)
  public List<CalendarDayDto> find(@RequestParam(required = false) Integer year,
		  @RequestParam(required = false) Long calendarId) {
    return this.beanMapper.mapList(this.calendarDayService.findByYearAndCalendarId(year, calendarId), CalendarDayDto.class);
  }

  
  /**
   * @param date
   * @param calendarId
   * @param categoryId
   */
  
  @RequestMapping(path = "/", method = RequestMethod.POST)
  public void save(@RequestBody CalendarDaySaveDto data) {
	  this.calendarDayService.createOrUpdate(data);
  }
  

}
