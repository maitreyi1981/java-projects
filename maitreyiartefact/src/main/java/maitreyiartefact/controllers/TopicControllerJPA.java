package maitreyiartefact.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import maitreyiartefact.services.TopicServiceJPA;
import maitreyiartefact.topic.TopicJPA;

@RestController
public class TopicControllerJPA {
	
	@Autowired
	private TopicServiceJPA topicServiceJPA;
	
	@RequestMapping("/topicsJPA")
	public List<TopicJPA> getAllTopics()
	{
		System.out.println("in controller");
		return topicServiceJPA.getAllTopics();
		
	}
	
	@RequestMapping("/topicJPA/{topicId}")
	public TopicJPA getTopic(@PathVariable Integer topicId)
	{
		return topicServiceJPA.getTopic(topicId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addTopicJPA")
	public void addTopic(@RequestBody TopicJPA topicJPA)
	{
		topicServiceJPA.addTopic(topicJPA);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateTopicJPA/{topicId}")
	public void updateTopic(@PathVariable Integer topicId, @RequestBody TopicJPA topicJPA)
	{
		topicServiceJPA.updateTopic(topicJPA);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteTopicJPA/{topicId}")
	public void deleteTopic(@PathVariable Integer topicId)
	{
		topicServiceJPA.deleteTopic(topicId);
		
	}
	
	
	}


