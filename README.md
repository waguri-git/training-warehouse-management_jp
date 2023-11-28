
# Step6 データベースの移行(マイグレーション)

## 1. マイグレーション

アプリケーションを再起動するたびに、データは常に元通りにリセットされるようになっています。

`/beginner/demo/demo/src/main/resources/`を見てみましょう

`db/migration`と`local/testdata`のパッケージがあり、そこにマイグレーションファイル[^1]があります。

[^1]: マイグレーションを行うためのSQLが書かれたSQLファイル

また、`src/main/java/com/excelence/demo/config/FlywayConfig.java`にプログラムされた`config`があります。

`migration`ファイルが変更され、競合が発生した場合ローカルではデータベースをリセットし、新バージョンの`migration`を実行すれば問題ありません。

しかし、実際の仕事では`migration`ファイルを安易に変更してはいけません。

そのためには、新しい`migration`ファイルを追加することが必要です。

## 2. Exercise

`V000006__add_price_menu.sql`という`migration`ファイルを追加し、以下のコードを記述します。

`ALTER TABLE example_menu ADD COLUMN price decimal(10, 2)；`

もう一度アプリケーションを実行し、`pgAdmin4`で実際のデータを参照してください。

value(価格)の列には`NULL`が記入されています。

[HINT]

[テーブル構造を変更する]https://www.javadrive.jp/mysql/table/index18.html

## 3. Extra
`Carrot` `玉ねぎ` `和牛`はどこから来たのでしょうか？

`local/testdata`パッケージには初期データを作成するマイグレーションファイルがあり、アプリケーションを実行する度に、指定したテーブルのデータを削除し、データを追加するようになっています。

では、`example_menu`に価格のデータが追加されるように`afterMigrate.sql`を編集して、動作するかどうか確認してみましょう。



改めておめでとうございます！

以上が、アプリケーションを作るのに必要なものの基本になります。

これからは、それらの知識を組み合わせて、自分の道を歩み始めましょう！