package com.video.data.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.video.data.domain.VideoData;
import com.video.data.service.VideoService;

@RestController
public class DataController {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private VideoService service;

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public VideoData getVideoData(@PathVariable("name") String name) {
		log.info("get video data by name {} ", name);
		return service.getVideoDataByName(name);
	}
	
	@RequestMapping(path = "/group/{group}", method = RequestMethod.GET)
	public List<VideoData> getVideoDataList(@PathVariable("group") String group) {
		log.info("get video data by group {} ", group);
		return service.getVideoDatasByGroup(group);
	}

}
