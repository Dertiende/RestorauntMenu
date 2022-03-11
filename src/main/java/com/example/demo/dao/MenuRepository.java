package com.example.demo.dao;

import com.example.demo.entity.Dish;
import com.example.demo.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MenuRepository extends JpaRepository<Menu, Integer> {

	void deleteById(Integer id);

	Optional<Menu> findMenuById(Integer id);
}
