package com.crud.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surName;
	private String telefono;
	private String email;
	
public Persona() {
	// TODO Auto-generated constructor stub
}



public Persona(int id, String name, String surName, String telefono, String email) {
	super();
	this.id = id;
	this.name = name;
	this.surName = surName;
	this.telefono = telefono;
	this.email = email;
}



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



public String getSurName() {
	return surName;
}



public void setSurName(String surName) {
	this.surName = surName;
}



public String getTelefono() {
	return telefono;
}



public void setTelefono(String telefono) {
	this.telefono = telefono;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}





}
