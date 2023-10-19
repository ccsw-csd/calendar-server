package com.ccsw.calendarmanager.calendarday.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lmbastant
 *
 */
@Entity
@Table(name = "calendar_day")
public class CalendarDayEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  
  @Column(name = "year", nullable = false)
  private Integer year;
	
  @Column(name = "date", nullable = false)
  private String date;
  
  @Column(name = "calendarId", nullable = false)
  private Long calendarId;
  
  @Column(name = "categoryId", nullable = false)
  private Long categoryId;

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

/**
 * @return the year
 */
public Integer getYear() {
	return year;
}

/**
 * @param year the year to set
 */
public void setYear(Integer year) {
	this.year = year;
}

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
 * @return the calendarId
 */
public Long getCalendarId() {
	return calendarId;
}

/**
 * @param calendarId the calendarId to set
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


}
