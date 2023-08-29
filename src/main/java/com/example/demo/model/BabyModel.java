package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="baby")
public class BabyModel{
	@Id 
	private int id;
	private String fname;
	private String lname;
	private String fathername;
	private String mothername;
	private String address;
	public BabyModel(int id, String fname, String lname, String fathername, String mothername, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.address = address;
	}
	public BabyModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}