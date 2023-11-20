package com.excellence.demo.controller.menu.request;

import com.excellence.demo.model.ExampleMenu;

public class ExampleMenuRequest {

    public final String name;

    // TODO: nameが空白でないかを検証するvalidate()を作成する

    public ExampleMenu toExampleMenu() {
        return toExampleMenu(0);
    }

    public ExampleMenu toExampleMenu(int id) {
        return new ExampleMenu(id, name);
    }

    public ExampleMenuRequest() {
        this.name = null;
    }
}
