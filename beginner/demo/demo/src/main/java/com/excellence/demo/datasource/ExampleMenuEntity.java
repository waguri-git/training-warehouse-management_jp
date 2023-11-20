package com.excellence.demo.datasource;

import com.excellence.demo.model.ExampleMenu;

public class ExampleMenuEntity {
    // TODO: ExampleMenuEntityクラスを完成させる
    final int id;
    final String name;

    public static ExampleMenuEntity of(ExampleMenu menu) {
        return new ExampleMenuEntity(
                menu.id(),
                menu.name()
        );
    }

    public ExampleMenuEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
