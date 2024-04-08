package com.xyz.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Product> pd = new ArrayList<>() ;
	
	
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
	public List<Product> getPd() {
		return pd;
	}
	public void setPd(List<Product> pd) {
		this.pd = pd;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", pd=" + pd + "]";
	}
	
	
	
}
