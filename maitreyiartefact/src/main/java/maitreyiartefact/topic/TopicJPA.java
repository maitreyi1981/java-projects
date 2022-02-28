package maitreyiartefact.topic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TOPIC")
public class TopicJPA {

	@Id
	@Column(name="TOPIC_ID")
	Integer topicId;
	
	@Column(name="TOPIC_NAME")
	String topicName;
	
	@Column(name="TOPIC_DESCRIPTION")
	String topicDescription;
	
	public TopicJPA(int topicId, String topicName, String topicDescription) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	
	public TopicJPA() {
		
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

}
