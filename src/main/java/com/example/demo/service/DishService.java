package com.example.demo.service;

import com.example.demo.dao.DishRepository;
import com.example.demo.entity.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DishService {


	private final DishRepository dishRepository;

	@Autowired
	public DishService(DishRepository dishRepository) {this.dishRepository = dishRepository;}

	public Dish addDish(Dish dish) {
		return dishRepository.save(dish);
	}

	public List<Dish> findAll() {
		return dishRepository.findAll();
	}

	public Dish updateDish(Dish dish){
		return dishRepository.save(dish);
	}

	public void deleteDish (Integer id){
		dishRepository.deleteById(id);
	}

	public List<Dish> findDishByMenu(Integer menuId){
		return dishRepository.findByMenu(menuId);
	}

	public Dish findDishById (Integer id) {
		return dishRepository.findDishById(id)
				       .orElse(null);
	}
}
