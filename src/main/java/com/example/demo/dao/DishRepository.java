package com.example.demo.dao;

import com.example.demo.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;

public interface DishRepository extends JpaRepository<Dish, Integer> {

	List<Dish> findByMenu(@Param("id") int id);

	@Override
	void deleteById(Integer id);

	Optional<Dish> findDishById(Integer id);
}
