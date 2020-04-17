package com.video.detail.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class VideoData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private String views;
	private Date uploadedDate;
	private String createdBy;
	private String group;

}
