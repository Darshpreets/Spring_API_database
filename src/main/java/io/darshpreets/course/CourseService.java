package io.darshpreets.course;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo courseRepo;

	
	public List<Courses> getAllCourses (String id){
		List<Courses> courses = new  ArrayList<>();
		courseRepo.findAll()
		.forEach(courses::add);
		return courses;
	}

	public Courses getCourses(String id) {
		return courseRepo.findById(id).get();
				}

	public void addCourses(Courses course) {
		
		courseRepo.save(course);
	}

	public void updateCourses(String id,  Courses topic1) {
		courseRepo.save(topic1);
		
	}

	public void deleteCourses(String id) {
		courseRepo.deleteById(id);
	}

	
}
