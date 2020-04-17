package com.video.list.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.video.list.client.VideoDataClient;
import com.video.list.domain.VideoData;

@RestController
public class VideoListController {

	private static final Logger LOGGER = LoggerFactory.getLogger(VideoListController.class);

	@Autowired
	private VideoDataClient client;

	@GetMapping("/{group}")
	public List<VideoData> findById(@PathVariable("group") String group) {
		LOGGER.info("Video list by group {}",group);
		return client.getVideoDataList(group);
	}

}
