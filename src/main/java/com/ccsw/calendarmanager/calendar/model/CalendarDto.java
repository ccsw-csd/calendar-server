package com.ccsw.calendarmanager.calendar.model;

/**
 * @author lbastant
 *
 */
public class CalendarDto {
	
  private Long id;

  private Long centerId;

  private Long groupId;
  
  private String centerName;
  
  private String groupName;

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

/**
 * @return the groupId
 */
public Long getGroupId() {
	return groupId;
}

/**
 * @param groupId the groupId to set
 */
public void setGroupId(Long groupId) {
	this.groupId = groupId;
}

/**
 * @return the centerName
 */
public String getCenterName() {
	return centerName;
}

/**
 * @param centerName the centerName to set
 */
public void setCenterName(String centerName) {
	this.centerName = centerName;
}

/**
 * @return the groupName
 */
public String getGroupName() {
	return groupName;
}

/**
 * @param groupName the groupName to set
 */
public void setGroupName(String groupName) {
	this.groupName = groupName;
}


 
}
