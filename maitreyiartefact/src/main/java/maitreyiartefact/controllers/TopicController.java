package maitreyiartefact.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import maitreyiartefact.services.TopicService;
import maitreyiartefact.topic.Topic;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
		
	}
	
	@RequestMapping("/topic/{topicId}")
	public Topic getTopic(@PathVariable Integer topicId)
	{
		return topicService.getTopic(topicId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addTopic")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateTopic/{topicId}")
	public void updateTopic(@PathVariable Integer topicId, @RequestBody Topic topic)
	{
		topicService.updateTopic(topicId, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteTopic/{topicId}")
	public void deleteTopic(@PathVariable Integer topicId)
	{
		topicService.deleteTopic(topicId);
		
	}
	
	
	}


