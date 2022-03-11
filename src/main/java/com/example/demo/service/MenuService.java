package com.example.demo.service;

import com.example.demo.dao.MenuRepository;
import com.example.demo.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {

	private final MenuRepository menuRepository;

	@Autowired
	public MenuService(MenuRepository menuRepository) {this.menuRepository = menuRepository;}

	public Menu addMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	public List<Menu> findAll() {
		return menuRepository.findAll();
	}

	public Menu updateMenu(Menu menu){
		return menuRepository.save(menu);
	}

	public void deleteMenu (Integer id){
		menuRepository.deleteById(id);
	}

	public Menu findMenuById (Integer id) {
		return menuRepository.findMenuById(id)
				.orElse(null);
	}
}
