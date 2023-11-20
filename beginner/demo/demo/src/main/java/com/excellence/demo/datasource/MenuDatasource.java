package com.excellence.demo.datasource;

import com.excellence.demo.model.ExampleMenu;
import com.excellence.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MenuDatasource implements MenuRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<ExampleMenu> getAllMenu() {
        // TODO: SQL文を書いて、jdbcTemplateを使って、DBからデータを取得する
        String sql = "ここに全てのレコードを取得するSQL文を書く";
        return null;
    }

    //　Hint: toModelメソッドは、DBから取得したレコードを宣言されたモデル(ExampleMenu)に変換する
    private ExampleMenu toModel(Map<String, Object> record) {
        return new ExampleMenu(
                (int) record.get("id"),
                (String) record.get("name")
        );
    }
}
