package maitreyiartefact.Courses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Course implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer CourseId;
	private String courseName;
	private String courseDescription;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private List<CourseTopic> listOfTopics=new ArrayList<CourseTopic>();
	
	public Course(Integer courseId, String courseName, String courseDescription, List<CourseTopic> listOfTopics) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.listOfTopics = listOfTopics;
	}
	
	public Course()
	{
		super();
	}
	
	public Integer getCourseId() {
		return CourseId;
	}
	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	public List<CourseTopic> getListOfTopics() {
		return listOfTopics;
	}
	public void setListOfTopics(List<CourseTopic> listOfTopics) {
		this.listOfTopics = listOfTopics;
	}
	
	
	public void displayCourse()
	{
		System.out.println("Id=" + CourseId + " name =" + courseName + " Description " + courseDescription);
	}

}
