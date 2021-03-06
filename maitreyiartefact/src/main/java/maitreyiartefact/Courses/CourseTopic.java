package maitreyiartefact.Courses;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;
import javax.persistence.ConstraintMode;

@Entity
public class CourseTopic implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer topicId;
	private String topicName;
	private String topicDescription;
	
	@ManyToOne
	//@JoinColumn(name = "topicId", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private Course course;
	
	public CourseTopic(int topicId, String topicName, String topicDescription, Course course) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.course=course;
	}
	
	public CourseTopic() {
		super();
		
	}

	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
	@Override
	public String toString()
	{
		return("id :" + topicId + ", " + " Name :" + topicName + "," + "Desc :" + topicDescription);
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}



}
