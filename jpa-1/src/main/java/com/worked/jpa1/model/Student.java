package com.worked.jpa1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
     @Id
	private int aid;
	private String aname;
	private String acourse;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAcourse() {
		return acourse;
	}
	public void setAcourse(String acourse) {
		this.acourse = acourse;
	}
	@Override
	public String toString() {
		return "Student [aid=" + aid + ", aname=" + aname + ", acourse=" + acourse + "]";
	}
	
	
}
