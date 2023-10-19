package com.ccsw.calendarmanager.calendar.model;

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
@Table(name = "calendar")
public class CalendarEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
	
  @Column(name = "center_id", nullable = false)
  private Long centerId;

  @Column(name = "group_id", nullable = false)
  private Long groupId;

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


}
