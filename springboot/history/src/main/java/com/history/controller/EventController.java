package com.history.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.history.model.Event;
import com.history.service.EventService;

@RestController()
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	EventService eventService;
	
//	@RequestMapping()
//	public void addEvent(){
//		
//	}
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public ResponseEntity<Collection<Event>> getEvents(){
		
	return new ResponseEntity<Collection<Event>>(eventService.getEvents(), HttpStatus.OK);
		
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void createEvents(@RequestBody ArrayList<Event> events){
		
		 eventService.createEvents(events);
		
	}
	
	@RequestMapping(value="",method=RequestMethod.DELETE)
	public void removeEvents(){
		
		 eventService.removeEvents();
		
	}

}
