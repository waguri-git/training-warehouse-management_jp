package com.excellence.demo.controller.menu.request;

import com.excellence.demo.model.ExampleMenu;
import com.excellence.demo.model.ValidateResult;

public class ExampleMenuRequest {

    public final String name;


    // TODO: nameが空白でないかを検証するvalidate()を作成する
    public ValidateResult validate(){
        if( name == "" ){ return ValidateResult.failed( "name can't be empty"); }
        return ValidateResult.success();
    }

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
