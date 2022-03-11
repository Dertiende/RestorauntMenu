package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Dictionary;

@Entity
@Table(name = "menu", schema = "default_schema")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "time")
	private String time;

	public Menu() {}

	public Menu(String name, String time) {
		this.name = name;
		this.time = time;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId(){return id;}
}
