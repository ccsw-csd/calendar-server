package com.ccsw.calendarmanager.group.model;

import java.util.List;

/**
 * @author lbastant
 *
 */
public class GroupDto {

  private Long id;

  private String name;
  
  private Double maxHourYear;
  
  private Double hoursWeek;
  
  private Double hoursF;
  
  private Double hoursIntensive;
  
  private String intensiveFrom;
  
  private String intensiveTo;
  
  private Double personalDays;
  
  private Double freeDays;
  
  private Double additionalDays;
  
  private Double holidays;
  
  private List<Long> centersSelected;
  
  

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
 * @return the maxHourWeek
 */
public Double getMaxHourYear() {
	return maxHourYear;
}

/**
 * @param maxHourWeek the maxHourWeek to set
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
 * @return the holyDays
 */
public Double getHolidays() {
	return holidays;
}

/**
 * @param holyDays the holyDays to set
 */
public void setHolidays(Double holidays) {
	this.holidays = holidays;
}

/**
 * @return the centersSelected
 */
public List<Long> getCentersSelected() {
	return centersSelected;
}

/**
 * @param centersSelected the centersSelected to set
 */
public void setCentersSelected(List<Long> centersSelected) {
	this.centersSelected = centersSelected;
}


}
