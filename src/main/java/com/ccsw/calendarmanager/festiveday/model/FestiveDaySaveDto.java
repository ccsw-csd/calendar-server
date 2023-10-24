package com.ccsw.calendarmanager.festiveday.model;

import java.util.List;

/**
 * @author lbastant
 *
 */
public class FestiveDaySaveDto {

  private List<FestiveDayDto> data;

/**
 * @return the data
 */
public List<FestiveDayDto> getData() {
	return data;
}

/**
 * @param data the data to set
 */
public void setData(List<FestiveDayDto> data) {
	this.data = data;
}


}