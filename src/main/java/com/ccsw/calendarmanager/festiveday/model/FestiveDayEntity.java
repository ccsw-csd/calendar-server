package com.ccsw.calendarmanager.festiveday.model;

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
@Table(name = "festive_day")
public class FestiveDayEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "year")
  private Integer year;
  
  @Column(name = "date")
  private String date;
  
  @Column(name = "center_id")
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
 * @return the center_id
 */
public Long getCenterId() {
	return centerId;
}

/**
 * @param center_id the center_id to set
 */
public void setCenterId(Long centerId) {
	this.centerId = centerId;
}

}
