package com.example.demo.controller;

import com.example.demo.entity.Dish;
import com.example.demo.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurant/dishes")
public class DishController {

	@Autowired
	private DishService dishService;

	@GetMapping
	public ResponseEntity<List<Dish>> getAllDishes(){
		List<Dish> dishes = dishService.findAll();
		return ResponseEntity.ok(dishes);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Dish> getDishById(@PathVariable("id") Integer id){
		Dish dish = dishService.findDishById(id);
		if (dish !=null){
			return ResponseEntity.ok(dish);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Dish> addDish(@RequestBody Dish dish){
		Dish newDish = dishService.addDish(dish);
		return new ResponseEntity<>(newDish, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Dish> updateDish(@RequestBody Dish dish){
		Dish updateDish = dishService.updateDish(dish);
		return ResponseEntity.ok(updateDish);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDish(@PathVariable("id") Integer id){
		dishService.deleteDish(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/searchByMenu/{id}")
	public ResponseEntity<List<Dish>> getDishByMenu(@PathVariable("id") Integer menuId){
		List<Dish> dishes = dishService.findDishByMenu(menuId);
		return ResponseEntity.ok(dishes);
	}
}
