package maitreyiartefact.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maitreyiartefact.Courses.Course;
import maitreyiartefact.Courses.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public void addCourse(Course newCourse)
	{
		System.out.println("Inside Course Service");
		newCourse.displayCourse();
		newCourse.getListOfTopics().forEach(e->
		{
			System.out.println(e.toString());
		});
		courseRepository.save(newCourse);
	}
	
	public Course getOneCourse(Integer CouseId)
	{
		return courseRepository.findById(CouseId).get();
	}

}
