package maitreyiartefact.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import maitreyiartefact.Courses.Course;
import maitreyiartefact.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(method=RequestMethod.POST, value="/addCourse")
	public void addCourse(@RequestBody Course newCourse)
	{
		System.out.println("Inside Course Controller");
		newCourse.displayCourse();
		newCourse.getListOfTopics().forEach(e->
		{
			System.out.println(e.toString());
			e.setCourse(newCourse);
		});
	
		courseService.addCourse(newCourse);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getOneCourse/{courseId}") 
	public Course getCourse(@PathVariable Integer courseId)
	{
		return courseService.getOneCourse(courseId);
	}

}
