package com.video.data.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.video.data.domain.VideoData;

@Service
public class VideoService {

	private Map<String, List<VideoData>> dataListMap = new HashMap<>();

	private Map<String, VideoData> dataMap = new HashMap<>();

	@PostConstruct
	private void init() {
		dataMap.put("diabetes", VideoData.builder().name("diabetes").description("diabetes by Dr.Lee").group("Medicare")
				.uploadedDate(new Date()).createdBy("system").views("500").build());
		dataMap.put("blood-pressure",
				VideoData.builder().name("blood-pressure").description("blood-pressure by Dr.Sanju sam")
						.group("Medicare").uploadedDate(new Date()).createdBy("system").views("200").build());
		dataMap.put("heart-function",
				VideoData.builder().name("heart-function").description("heart function by Dr.Sourav Khan")
						.group("Medicare").uploadedDate(new Date()).createdBy("system").views("350").build());
		dataMap.put("lung-function", VideoData.builder().name("lung-function").description("lungs function by Dr.Jeff")
				.group("Medicare").uploadedDate(new Date()).createdBy("system").views("500").build());

		dataMap.put("kidney-function",
				VideoData.builder().name("kidney-function").description("kidney function by Dr.Gary").group("Medicare")
						.uploadedDate(new Date()).createdBy("system").views("100").build());
		dataListMap.put("Medicare", new ArrayList<>(dataMap.values()));

	}
	
	public List<VideoData> getVideoDatasByGroup(String group){
		return dataListMap.get(group);
	}
	
	public VideoData getVideoDataByName(String name){
		return dataMap.get(name);
	}
}
