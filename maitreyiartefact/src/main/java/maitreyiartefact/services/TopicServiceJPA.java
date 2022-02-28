package maitreyiartefact.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import maitreyiartefact.topic.TopicJPA;
import maitreyiartefact.topic.TopicRepository;


@Service 
public class TopicServiceJPA {
	
	private List<TopicJPA> topicArray=new ArrayList<TopicJPA>();
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<TopicJPA> getAllTopics()
	{
		topicRepository.findAll().forEach(topicArray::add); 
		System.out.println("within topic service JPA" + topicArray.size());
		topicArray.forEach(s->s.toString());
		return topicArray;
	}
	
	public TopicJPA getTopic (Integer id)
	{
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(TopicJPA topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(TopicJPA topicJPA)
	{
		TopicJPA updateTopic=topicRepository.findById(topicJPA.getTopicId()).get();
		topicRepository.save(updateTopic);
	}
	
	public void deleteTopic(Integer topicId)
	{
		topicRepository.deleteById(topicId);
	}

}
