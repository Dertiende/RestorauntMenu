package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "dishes", schema = "default_schema")
public class Dish {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "cuisine")
	private String cuisine;

	@Column(name="portion")
	private String portion;

	@Column(name="about")
	private String about;

	@Column(name="value")
	private int value;

	@Column(name = "menu")
	private int menu;

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

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getPortion() {
		return portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public Dish (){}

	public Dish(String name, String cuisine, String portion, String about, int value, int menu) {
		this.name = name;
		this.cuisine = cuisine;
		this.portion = portion;
		this.about = about;
		this.value = value;
		this.menu = menu;
	}
}
