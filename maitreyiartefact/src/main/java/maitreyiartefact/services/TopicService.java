package maitreyiartefact.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import maitreyiartefact.topic.Topic;


@Service 
public class TopicService {
	
	private ArrayList<Topic> topicArray=new ArrayList<Topic>(Arrays.asList(
			
			new Topic(1, "Core Java", "This is Java 1.8"),
			new Topic(2, "SpringBoot", "This is Springboot"),
			new Topic(3, "Microservices", "This is Microservices"),
			new Topic(4, "MongoDB", "This is mongoDB"),
			new Topic(5, "CI/CD", "This is CI/CD")
			));
	
	public List<Topic> getAllTopics()
	{
		return topicArray;
	}
	
	public Topic getTopic (int id)
	{
		return topicArray.stream().filter(t->t.getTopicId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic)
	{
		topic.toString();
		topicArray.add(topic);
	}
	
	public void updateTopic(int topicId,Topic topic)
	{
		Topic findTopic = topicArray.stream().filter(t->t.getTopicId().equals(topicId)).findFirst().get();
		findTopic.setTopicName(topic.getTopicName());
		findTopic.setTopicDescription(topic.getTopicDescription());
	}
	
	public void deleteTopic(int topicId)
	{
		topicArray.removeIf(t->t.getTopicId().equals(topicId));
	}

}
