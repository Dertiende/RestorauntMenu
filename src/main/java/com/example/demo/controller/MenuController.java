package com.example.demo.controller;


import com.example.demo.entity.Menu;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurant/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping
	public ResponseEntity<List<Menu>> getAllMenu(){
		List<Menu> menus = menuService.findAll();
		return ResponseEntity.ok(menus);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Menu> getMenuById(@PathVariable("id") Integer id) {
		Menu menu = menuService.findMenuById(id);
		if (menu != null) {
			return ResponseEntity.ok(menu);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<Menu> addMenu(@RequestBody Menu menu) {
		Menu newMenu = menuService.addMenu(menu);
		return new ResponseEntity<>(newMenu, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Menu> updateMenu(@RequestBody Menu menu) {
		Menu updateMenu = menuService.updateMenu(menu);
		return ResponseEntity.ok(updateMenu);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Menu> deleteMenu(@PathVariable("id") Integer id) {
		menuService.deleteMenu(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
