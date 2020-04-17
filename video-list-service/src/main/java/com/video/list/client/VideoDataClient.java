package com.video.list.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.video.list.domain.VideoData;

@FeignClient(name = "video-data-service")
public interface VideoDataClient {

	@RequestMapping(path = "/data/{name}", method = RequestMethod.GET)
	public VideoData getVideoData(@PathVariable String name);
	
	@RequestMapping(path = "/data/group/{group}", method = RequestMethod.GET)
	public List<VideoData> getVideoDataList(@PathVariable String group);

}
