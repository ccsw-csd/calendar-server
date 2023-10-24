package com.ccsw.calendarmanager.festiveday.model;

/**
 * @author lbastant
 *
 */
public class FestiveDayDto {

  private Long id;
  
  private Integer year;

  private String date;
  
  private Long centerId;

  /**
   * @return id
   */
  public Long getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
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
 * @return the centerId
 */
public Long getCenterId() {
	return centerId;
}

/**
 * @param centerId the centerId to set
 */
public void setCenterId(Long centerId) {
	this.centerId = centerId;
}

  
}
