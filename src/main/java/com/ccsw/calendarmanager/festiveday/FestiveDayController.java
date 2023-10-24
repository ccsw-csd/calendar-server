package com.ccsw.calendarmanager.festiveday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;
import com.ccsw.calendarmanager.festiveday.model.FestiveDayDto;
import com.ccsw.calendarmanager.festiveday.model.FestiveDaySaveDto;

/**
 * @author lbastant
 *
 */
@RequestMapping(value = "/festive")
@RestController
public class FestiveDayController {

  @Autowired
  FestiveDayService festiveDayService;

  @Autowired
  private BeanMapper beanMapper;

  /**
   * @param year
   * @param centerId
   * @return List festives
   */
  @RequestMapping(method = RequestMethod.GET)
  public List<FestiveDayDto> find(@RequestParam(required = false) Integer year,
		  @RequestParam(required = false) Long centerId) {
    return this.beanMapper.mapList(this.festiveDayService.findByYearAndCenterId(year, centerId), FestiveDayDto.class);
  }
  
  /**
   * @param date
   * @param calendarId
   * @param categoryId
   */
  
  @RequestMapping(path = "/", method = RequestMethod.POST)
  public void save(@RequestBody FestiveDaySaveDto data) {
	  this.festiveDayService.createOrUpdate(data);
  }
  

}
