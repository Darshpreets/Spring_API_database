package io.darshpreets.topic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepo topicRepo;

	
	public List<Topics> getAllTopics (){
		List<Topics> topic = new  ArrayList<>();
		topicRepo.findAll()
		.forEach(topic::add);
		return topic;
	}

	public Topics getTopic(String id) {
		return topicRepo.findById(id).get();
				}

	public void addTopic(Topics topic1) {
		
		topicRepo.save(topic1);
	}

	public void updateTopic(String id,  Topics topic1) {
		topicRepo.save(topic1);
		
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
	}

	
}
