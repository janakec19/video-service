package com.video.detail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.video.detail.client.VideoDataClient;
import com.video.detail.domain.VideoData;

@RestController
public class VideoDetailController {

	private static final Logger LOGGER = LoggerFactory.getLogger(VideoDetailController.class);

	@Autowired
	private VideoDataClient client;
	
	@GetMapping("/{videoId}")
	public VideoData findById(@PathVariable("videoId") String videoId) {
		LOGGER.info("Video by id {}",videoId);
		return client.getVideoData(videoId);
	}

}
