package com.ccsw.calendarmanager.calendarday.model;

import java.util.List;

/**
 * @author lbastant
 *
 */
public class CalendarDaySaveDto {

  private List<CalendarDayDto> data;

/**
 * @return the data
 */
public List<CalendarDayDto> getData() {
	return data;
}

/**
 * @param data the data to set
 */
public void setData(List<CalendarDayDto> data) {
	this.data = data;
}


}