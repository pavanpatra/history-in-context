package com.history.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.history.model.Event;
import com.history.repository.EventRepository;

@Service
public class EventService {
	
	private Hashtable<String,Event> historyEvents =new Hashtable<String,Event>();
	
	@Autowired
	private EventRepository eventRepository;
	
	public EventService(){
		  SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		Event e1=new Event();
		e1.setId("1");
		e1.setWhat("India freedom");
		try {
			e1.setWhen(dateformat.parse("15/8/1947"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e1.setWhere("India");
		
		historyEvents.put(e1.getId(), e1);
		
		Event e2=new Event();
		e2.setId("2");
		e2.setWhat("9/11 attacks NY");
		try {
			e2.setWhen(dateformat.parse("9/11/2001"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e2.setWhere("USA");
		
		historyEvents.put(e2.getId(), e2);
	}

	public Collection<Event> getEvents(){
		
		//Collections.list(historyEvents.values())
		//return   new ArrayList<Event>(historyEvents.values());
		return eventRepository.findAll();
	}
	
	public void createEvents(List<Event> events){
		
		
		eventRepository.save(events);
		
//		for(Event event : events){
//			historyEvents.put(event.getId(), event);
//			
//		}
		
		
	}

	public void removeEvents() {
		eventRepository.deleteAll();
		
	}
}
