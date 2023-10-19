package com.ccsw.calendarmanager.group.model;

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
@Table(name = "`group`")
public class GroupEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name")
  private String name;
  
  @Column(name = "max_hour_year")
  private Double maxHourYear;
  
  @Column(name = "hours_week")
  private Double hoursWeek;
  
  @Column(name = "hours_from")
  private Double hoursF;
  
  @Column(name = "hours_intensive")
  private Double hoursIntensive;
  
  @Column(name = "intensive_from")
  private String intensiveFrom;
  
  @Column(name = "intensive_to")
  private String intensiveTo;
  
  @Column(name = "personal_days")
  private Double personalDays;
  
  @Column(name = "free_days")
  private Double freeDays;
  
  @Column(name = "additional_days")
  private Double additionalDays;
  
  @Column(name = "holidays")
  private Double holidays;

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
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

/**
 * @return the maxHourYear
 */
public Double getMaxHourYear() {
	return maxHourYear;
}

/**
 * @param maxHourWeek the maxHourYear to set
 */
public void setMaxHourYear(Double maxHourYear) {
	this.maxHourYear = maxHourYear;
}

/**
 * @return the hoursWeek
 */
public Double getHoursWeek() {
	return hoursWeek;
}

/**
 * @param hoursWeek the hoursWeek to set
 */
public void setHoursWeek(Double hoursWeek) {
	this.hoursWeek = hoursWeek;
}

/**
 * @return the hoursF
 */
public Double getHoursF() {
	return hoursF;
}

/**
 * @param hoursF the hoursF to set
 */
public void setHoursF(Double hoursF) {
	this.hoursF = hoursF;
}

/**
 * @return the hoursIntensive
 */
public Double getHoursIntensive() {
	return hoursIntensive;
}

/**
 * @param hoursIntensive the hoursIntensive to set
 */
public void setHoursIntensive(Double hoursIntensive) {
	this.hoursIntensive = hoursIntensive;
}

/**
 * @return the intensiveFrom
 */
public String getIntensiveFrom() {
	return intensiveFrom;
}

/**
 * @param intensiveFrom the intensiveFrom to set
 */
public void setIntensiveFrom(String intensiveFrom) {
	this.intensiveFrom = intensiveFrom;
}

/**
 * @return the intensiveTo
 */
public String getIntensiveTo() {
	return intensiveTo;
}

/**
 * @param intensiveTo the intensiveTo to set
 */
public void setIntensiveTo(String intensiveTo) {
	this.intensiveTo = intensiveTo;
}

/**
 * @return the personalDays
 */
public Double getPersonalDays() {
	return personalDays;
}

/**
 * @param personalDays the personalDays to set
 */
public void setPersonalDays(Double personalDays) {
	this.personalDays = personalDays;
}

/**
 * @return the freeDays
 */
public Double getFreeDays() {
	return freeDays;
}

/**
 * @param freeDays the freeDays to set
 */
public void setFreeDays(Double freeDays) {
	this.freeDays = freeDays;
}

/**
 * @return the additionalDays
 */
public Double getAdditionalDays() {
	return additionalDays;
}

/**
 * @param additionalDays the additionalDays to set
 */
public void setAdditionalDays(Double additionalDays) {
	this.additionalDays = additionalDays;
}

/**
 * @return the holidays
 */
public Double getHolidays() {
	return holidays;
}

/**
 * @param holidays the holidays to set
 */
public void setHolidays(Double holidays) {
	this.holidays = holidays;
}

}
