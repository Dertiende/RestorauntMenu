package com.example.demo.exceptions;

public class DishNotFoundException extends RuntimeException {
	public DishNotFoundException(String s) {
		super(s);
	}
}
