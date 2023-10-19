package com.ccsw.calendarmanager.categoryday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccsw.calendarmanager.calendar.model.CalendarDto;
import com.ccsw.calendarmanager.categoryday.model.CategoryDayDto;
import com.ccsw.calendarmanager.center.model.CenterDto;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;

/**
 * @author lbastant
 *
 */
@RequestMapping(value = "/category")
@RestController
public class CategoryDayController {

  @Autowired
  CategoryDayService categoryDayService;

  @Autowired
  private BeanMapper beanMapper;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public List<CategoryDayDto> get() {

    return this.beanMapper.mapList(this.categoryDayService.getAllCategories(), CategoryDayDto.class);
  }

  
  /**
   * @param name
   * @return hours
   */
  
 /* @RequestMapping(path = "/", method = RequestMethod.POST)
  public CategoryDayDto save(@RequestBody CategoryDayDto data) {

	  return this.beanMapper.map(this.categoryDayService.createOrUpdate(data), CategoryDayDto.class);
  }*/
  
  /**
   * @param name
   * @param id
   * @return hours
   */
/*  @RequestMapping(path = "/", method = RequestMethod.PUT)
  public CategoryDayDto update(@RequestBody CategoryDayDto data) {
      return this.beanMapper.map(this.categoryDayService.createOrUpdate(data), CategoryDayDto.class);
  }*/
  
  
  /**
   * @param id
   */
 /* @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
  public void deleteById(@PathVariable Long id)  {
      this.categoryDayService.deleteById(id);
  }
*/
}
