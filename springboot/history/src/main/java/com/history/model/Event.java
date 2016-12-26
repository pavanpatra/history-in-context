package com.history.model;

import java.util.Date;


import org.springframework.data.annotation.Id;

public class Event {
	
	private Date when;
	private String where;
	private String what;
	@Id 
    //@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	public Event(){
		this.when = new Date();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getWhen() {
		return when;
	}
	public void setWhen(Date when) {
		this.when = when;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	

}
