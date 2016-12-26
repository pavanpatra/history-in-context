package com.history.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.history.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {

	//public Event findByWher(String firstName);
	//public List<Event> findByWhat(String lastName);

}



