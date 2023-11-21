# Step2  データの参照

### データベースの起動

Dockerが起動していなければ、起動させておきましょう。  
データベースのリセットもできます。

`./beginner/demo/demo/local/start.sh`  



### ツールのインストール

データベースの中身を見るために、`PGAdmin4`というGUIツールを利用します。

- [こちら](https://www.pgadmin.org/download/)から`PGAdmin4`をインストールします。
  - [インストール方法](https://qiita.com/pyon_kiti_jp/items/01d6150e46bd66be29f0)
- インストール後
  - Serversを右クリック -> Register -> Server...
  - -> `General`タブのNameに `warehouse` を入力
  - -> `Connection`タブのHost name/addressに `localhost` , Portに `5432` , Maintenance databaseに `warehouse` , Usernameに `warehouseuser` , Passwordに `warehousepassword` -> savepassword?を `ON` 
  - -> `Save` をクリック
- `Intellij`で`DemoApplication`をRun
  - pgAdmin4で Servers -> warehouse -> Databases -> warehouse -> Schemas -> public -> Tables -> example_menuを右クリック -> View/Edit Data -> All Rows -> 用意されたデータが表示されます。
  これらをTutorialで使用します。

## Tutorial

`DemoApplication`を実行しましょう。

`order.html`ファイルを開き、ボタンをクリックすると、`example_order`と同じデータが表示されます。
`order.js`ファイルを見てみましょう。  
サーバーの呼び出しがあります。

`Intellij`を見ると、いくつかのファイルとフォルダが追加されていると思います。  
それぞれのフォルダの意味を説明しておきます。

- Controller
  - Controllerは、クライアントとの架け橋です。クライアントがリクエストを送信すると、まずControllerに送信され、処理が完了すると、クライアントに返信されます。
- Service
  - Serviceは、このアプリケーションがどのような処理を行うかを決定するものです。今回の例では、全ての注文を得ることができます。
- Repository
  - Repositoryは、複雑なコードを隠すことができるインターフェースです。インターフェースの活用はコードをよりシンプルに、見やすくすることができます。
- Datasource
  - Datasourceは、Repositoryから複雑なコードを実装するものです。今回の例では、データベースに接続し、SQL文を実行します。
- Model
  - Modelは、このアプリケーションにどのようなデータの型があるかを宣言します。

それぞれのクラスがどのように繋がっているのかを、理解しましょう。

## Exercise

`exercise_html`ファイルを開くと、`get menus`ボタンがあると思います。  
ボタンを押すと、`example_menu`のテーブルが表示されるようにしましょう。  
ヒント：コードが不十分なのは、`MenuDatasource`、`MenuController`、`MenusResponse`です。それぞれのクラスにはTODOコメントで指示が書かれています。  
