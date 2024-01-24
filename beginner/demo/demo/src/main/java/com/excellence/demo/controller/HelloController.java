package com.excellence.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return "Greetings from Java Spring Boot!";
    }
}


//@RequestMappingは()内の住所を設定している(リクエスト先を設定)
//@GetMappingの場合14行目の回答が返る
//Mappingは目的地の設定、ピン刺しの意味
//Getリクエストが/helloにMappingされ、GetMappingで振り分けられる
//GETやPUTはリクエストメソッドの種類（補助資料参考）
//9～10行目のアノテーションはクラスについているが、12～13行目のアノテーションはクラス内に存在し、14行目についている
//404NotFoundedはHTTPレスポンスのエラーコード
//13行目の()内でHTTPレスポンスのステータス行の3桁の数字を設定している（OKは200）
