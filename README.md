# step5 データの削除

### Tutorial

`DemoApplication`を起動しましょう。

`order.html` ファイルを開きましょう。

Editボタンの隣にDeleteボタンが追加されています。
押すと何が起こるか確認してください。

### Exercise

データを削除する機能を実装しましょう

今までのStepを思い出し、得た知識を活用しながら進めてください。


### EXTRA

- この[説明](https://yu-report.com/entry/postman/)に従ってPostmanをインストールします。
  - [POSTMANの使用例](https://rainbow-engine.com/postman-howto-intro/)
  
   POSTMANとは？
   
   =APIのテストを行うためのツール。

　  手早くHTTPリクエストを送信してエンドポイントが正しく機能しているか確認することができます。
  - 今度は`POSTMAN`を使ってJavaサーバーにアクセスしてみましょう。
    `fetch` 関数のように、`URL endpoint` と `HTTP METHOD` を追加し、必要に応じて `JSON` BODY を追加する。
    
    JAVAアプリケーションからすべてのCRUDサービスにアクセスする。
      
    例えば、`http://localhost:8080/orders/1`は、id = 1の注文レコードを取得する。