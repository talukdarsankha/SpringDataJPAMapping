package com.xyz.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	@OneToOne(mappedBy = "emp",cascade = CascadeType.ALL)
	private Mobile mb;
	@OneToMany(mappedBy = "em",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Address> address;
	
	
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Mobile getMb() {
		return mb;
	}
	public void setMb(Mobile mb) {
		this.mb = mb;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", mb=" + mb + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
