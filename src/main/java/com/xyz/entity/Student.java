package com.xyz.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(mappedBy = "stu",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<StuAddress> ll = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<StuAddress> getLl() {
		return ll;
	}
	public void setLl(List<StuAddress> ll) {
		this.ll = ll;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ll=" + ll + "]";
	}
	
	
	
	

}



