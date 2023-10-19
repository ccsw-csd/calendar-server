package com.ccsw.calendarmanager.center;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccsw.calendarmanager.center.model.CenterDto;
import com.ccsw.calendarmanager.config.mapper.BeanMapper;

/**
 * @author lbastant
 *
 */
@RequestMapping(value = "/center")
@RestController
public class CenterController {

  @Autowired
  CenterService centerService;

  @Autowired
  private BeanMapper beanMapper;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public List<CenterDto> get() {

    return this.beanMapper.mapList(this.centerService.getAllCenters(), CenterDto.class);
  }
  
  /**
   * @param groupId
   * @return group
   * 
   */
  
  @RequestMapping(path = "/{centerId}/", method = RequestMethod.GET)
  public CenterDto findById(@PathVariable("centerId") Integer centerId) {
    return this.beanMapper.map(this.centerService.getById(centerId), CenterDto.class);
  }

  
  /**
   * @param name
   * @return center
   */
  
  @RequestMapping(path = "/", method = RequestMethod.POST)
  public CenterDto save(@RequestBody CenterDto data) {

	  return this.beanMapper.map(this.centerService.createOrUpdate(data), CenterDto.class);
  }
  
  /**
   * @param name
   * @param id
   * @return center
   */
  @RequestMapping(path = "/", method = RequestMethod.PUT)
  public CenterDto update(@RequestBody CenterDto data) {
      return this.beanMapper.map(this.centerService.createOrUpdate(data), CenterDto.class);
  }
  
  
  /**
   * @param id
   */
  @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
  public void deleteById(@PathVariable Long id)  {
      this.centerService.deleteById(id);
  }

}
