package com.ccsw.calendarmanager.categoryday;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccsw.calendarmanager.calendar.CalendarRepository;
import com.ccsw.calendarmanager.categoryday.model.CategoryDayDto;
import com.ccsw.calendarmanager.categoryday.model.CategoryDayEntity;
import com.ccsw.calendarmanager.center.model.CenterDto;
import com.ccsw.calendarmanager.center.model.CenterEntity;
/**
 * @author lmbastant
 *
 */
@Service
public class CategoryDayServiceImpl implements CategoryDayService {

  @Autowired
  CategoryDayRepository categoryDayRepository;

  private static final Logger LOG = LoggerFactory.getLogger(CategoryDayServiceImpl.class);

  @Override
  public List<CategoryDayEntity> getAllCategories() {

    Iterable<CategoryDayEntity> categoriesEntities = this.categoryDayRepository.findAll();
    List<CategoryDayEntity> categoryEntityList = new ArrayList<CategoryDayEntity>();
    categoriesEntities.forEach(categoryEntityList::add);

    return categoryEntityList;
  }

  @Override
  public CategoryDayEntity getById(Integer id) {

    return this.categoryDayRepository.findById(id);
  }

  
  @Override
  public CategoryDayEntity createOrUpdate(CategoryDayDto dto) {
	  CategoryDayEntity category = new CategoryDayEntity();
		if (dto.getId() != null) {
			category = categoryDayRepository.findById(dto.getId()).orElse(null);
			this.categoryDayRepository.deleteById(dto.getId());  
		}

		 BeanUtils.copyProperties(dto, category, getNullPropertyNames(dto));
	     this.categoryDayRepository.save(category);
	     category = categoryDayRepository.findByName(category.getName());  
	  
    return category;
  }
  
  @Override
  public void deleteById(Long id) {
	  this.categoryDayRepository.deleteById(id);
  }
  
  public String[] getNullPropertyNames(Object source) {
	    final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
	    return Stream.of(wrappedSource.getPropertyDescriptors())
	            .map(FeatureDescriptor::getName)
	            .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
	            .toArray(String[]::new);
	}

}
