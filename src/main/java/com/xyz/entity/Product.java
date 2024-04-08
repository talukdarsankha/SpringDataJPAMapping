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
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(mappedBy = "pd",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Category> cat = new ArrayList<>();
	
	
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
	public List<Category> getCat() {
		return cat;
	}
	public void setCat(List<Category> cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cat=" + cat + "]";
	}
	
	
	
}
