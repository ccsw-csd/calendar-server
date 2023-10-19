package com.ccsw.calendarmanager.calendarday.model;

/**
 * @author lbastant
 *
 */
public class CalendarDayDto {
  
  private Long id;

  private String date;
  
  private Long calendarId;
  
  private Long categoryId;


/**
 * @return the date
 */
public String getDate() {
	return date;
}

/**
 * @param date the date to set
 */
public void setDate(String date) {
	this.date = date;
}

/**
 * @return the calendaryId
 */
public Long getCalendarId() {
	return calendarId;
}

/**
 * @param calendaryId the calendaryId to set
 */
public void setCalendarId(Long calendarId) {
	this.calendarId = calendarId;
}

/**
 * @return the categoryId
 */
public Long getCategoryId() {
	return categoryId;
}

/**
 * @param categoryId the categoryId to set
 */
public void setCategoryId(Long categoryId) {
	this.categoryId = categoryId;
}

/**
 * @return the id
 */
public Long getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
  
  


}