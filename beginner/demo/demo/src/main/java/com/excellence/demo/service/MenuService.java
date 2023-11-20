package com.excellence.demo.service;

import com.excellence.demo.model.ExampleMenu;
import com.excellence.demo.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    private final MenuRepository repository;

    public List<ExampleMenu> getAllMenu() {
        List<ExampleMenu> menus = repository.getAllMenu();
        return menus;
    }

    public MenuService(MenuRepository repository) {
        this.repository = repository;
    }
}