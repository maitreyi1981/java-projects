package maitreyiartefact.topic;

public class Topic {
	
	Integer topicId;
	String topicName;
	String topicDescription;
	
	public Topic(int topicId, String topicName, String topicDescription) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	
	public Topic() {
		
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
	
	public String toString()
	{
		return("id :" + topicId + ", " + " Name :" + topicName + "," + "Desc :" + topicDescription);
	}

}
