package io.darshpreets.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseContoller {
	
	@Autowired
	private CourseService topicService;
	
	@GetMapping("/topics")
	public List<Courses> getAllTopics ( ) {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Courses getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Courses topic1) {
		topicService.addTopic(topic1); 
		
	}

	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Courses topic1, @PathVariable String id) {
		topicService.updateTopic(id, topic1); 	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		
	}
	
	
}
