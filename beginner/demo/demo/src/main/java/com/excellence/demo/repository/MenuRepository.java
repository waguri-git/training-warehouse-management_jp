package com.excellence.demo.repository;

import com.excellence.demo.model.ExampleMenu;

import java.util.List;

public interface MenuRepository {
    List<ExampleMenu> getAllMenu();

    void insertMenu(ExampleMenu menu);
}