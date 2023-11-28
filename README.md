# Step5 データの削除

## 1. Tutorial

1. 動作の確認  
`DemoApplication`をRunしましょう。  
`order.html` ファイルをブラウザで開きましょう。
Editボタンの隣にDeleteボタンが追加されています。
押すと何が起こるか確認してください。

2. コードリーディング  
削除のプロセスがどのように行われるのか理解しましょう。
今までのStepをしっかり理解していれば、問題なく読めると思います。

## 2. Exercise

データを削除する機能を実装しましょう。  
今までのStepを思い出し、得た知識を活用しながら進めてください。


## 3. Extra -Postmanの使い方-
`Postman`とは、APIのテストを行うためのツールです。  
手早くHTTPリクエストを送信してエンドポイントが正しく機能しているか確認することができます。

1. `Postman`のインストール  
[こちら](https://yu-report.com/entry/postman/)を参考に`Postman`をインストールしてください。  

2. Tutorial  
[こちら](https://rainbow-engine.com/postman-howto-intro/)を参考に`Postman`を使ってJavaサーバーにアクセスしてみましょう。
`fetch` 関数のように、`URLのエンドポイント` と `HTTPリクエストメソッド` を追加し、必要に応じて `JSON`ボディ を追加します。  
例えば、`http://localhost:8080/orders/1`は、id = 1の注文レコードを取得するURLです。

3. Exercise  
すべてのCRUDサービスにアクセスをしてみてください。

4. Challenge  
サーバーに追加の情報を送るためにURLの末尾に加えられる変数(文字列)のことを**パラメータ**と言います。  
今回のStepやStep4で登場した`http://localhost:8080/orders/${id}`の末尾の`id`の部分がパラメータです。  
パラメータの書き方には、**クエリパラメータ**と**パスパラメータ**が存在します(2つの詳しい違いについては[こちら](https://zenn.dev/eri_agri/articles/859a3362db8386)を参照)。  
2つのパラメータについて、理解ができたら、次の課題に挑戦してください。
   - 削除するorderのidを受け取っていたパスパラメータの部分をクエリパラメータに変更する。[^1]  
   ヒント：@PathVariableではなく、[@RequestParam](https://www.tairaengineer-note.com/springboot-requestparam-annotation/)を使いましょう。

[^1]: 今回は練習でパスパラメータからクエリパラメータに変更しますが、DELETEリクエストであれば、パスパラメータのほうが適切かと思います。
