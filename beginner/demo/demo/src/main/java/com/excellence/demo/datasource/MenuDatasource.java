package com.excellence.demo.datasource;

import com.excellence.demo.model.ExampleMenu;
import com.excellence.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

@Repository
public class MenuDatasource implements MenuRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<ExampleMenu> getAllMenu() {
        // TODO: SQL文を書いて、jdbcTemplateを使って、DBからデータを取得する
        String sql = "SELECT * FROM Example_menu";
        List<Map<String, Object>> records = jdbcTemplate.queryForList(sql);
        return records.stream()
                .map(record -> toModel(record))
                .collect(toList());
    }

    @Override
    public void insertMenu(ExampleMenu menu) {
        // TODO: insertMenu()を完成させる
        String sql = "ここにテーブルにデータを追加するSQL文を書く";
    }

    //　toModelメソッドは、DBから取得したレコードを宣言されたモデル(ExampleMenu)に変換する
    private ExampleMenu toModel(Map<String, Object> record) {
        return new ExampleMenu(
                (int) record.get("id"),
                (String) record.get("name")
        );
    }
}