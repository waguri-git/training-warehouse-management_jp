package com.excellence.demo.controller.menu.response;

import com.excellence.demo.model.ExampleMenu;

import java.util.List;

public class MenusResponse {
    //TODO: クライアントに返す内容を記述
    public List<ExampleMenu> menus;

    public MenusResponse(List<ExampleMenu> menus) {
        this.menus = menus;
    }
}