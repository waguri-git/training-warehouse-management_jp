# step5 データの削除

## 1. Tutorial

`DemoApplication`を起動しましょう。

`order.html` ファイルを開きましょう。

Editボタンの隣にDeleteボタンが追加されています。
押すと何が起こるか確認してください。

## 2. Exercise

データを削除する機能を実装しましょう

今までのStepを思い出し、得た知識を活用しながら進めてください。


## 3. Extra
POSTMANとは、APIのテストを行うためのツールです。  
手早くHTTPリクエストを送信してエンドポイントが正しく機能しているか確認することができます。

この[説明](https://yu-report.com/entry/postman/)に従ってPostmanをインストールします。  

POSTMANの使用例は[こちら](https://rainbow-engine.com/postman-howto-intro/)
  
使用例をみながら`POSTMAN`を使ってJavaサーバーにアクセスしてみましょう。
`fetch` 関数のように、`URLのエンドポイント` と `HTTPリクエストメソッド` を追加し、必要に応じて `JSON`ボディ を追加します。
      
例えば、`http://localhost:8080/orders/1`は、id = 1の注文レコードを取得するURLです。

では、すべてのCRUDサービスにアクセスをしてみてください。

