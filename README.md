# Step1 クライアントとサーバー

## 開発ツールのインストール

### Gitの導入

- `GitHub`の[公式サイト](https://github.co.jp)からアカウントを作成します。

- `Git` を[公式サイト](https://git-scm.com/downloads)からインストールします。

- このリポジトリを[Fork](https://docs.github.com/ja/get-started/quickstart/fork-a-repo)します。

- ローカル上の任意の場所にリポジトリのクローンを作成します。  
  - `Git Bash`もしくは `terminal`を起動します。  
  - `cd` コマンドでリポジトリをクローンしたいフォルダに移動します。  
  - `git clone {リポジトリのURL}`&nbsp;を入力
- `Fork` を[こちら](https://git-fork.com/)からインストールします。
  - Forkの使い方は[こちら](https://qiita.com/AyakoKataoka/items/e1b0a2a2b2c85de4c1e3)
  - step1にbranchを切り替えておいてください

### Javaのインストール・環境変数の設定

- [こちら](https://www.oracle.com/java/technologies/downloads/#java11)のサイトから`JDK11` をインストールします。
  - **`JDK11`をどこにインストールしたのか、確認しておいてください。**
  - **必ず、`JDK11`をインストールしてください。他のverだと正常に動作しない可能性があります。**
  - **インストールの際は、Oracleのアカウントが必要になります。**

- 環境変数を設定します。
    - Windowsの場合
      - システムの環境変数の新規をクリック
      - 変数名：`JAVA_HOME`
      - 変数値：`{JDKをインストールしたフォルダのパス}`
      - システムの環境変数の `Path` を編集
      - [新規(N)]ボタンをクリックし、`%JAVA_HOME%\bin`を入力
      - 参考サイトは[こちら](https://itc.tokyo/linux/export-command/)

    - Macの場合
      - `terminal`を起動
      - `/usr/libexec/java_home -v 11`を入力
      - 出力されたパスをコピー
      - `export JAVA_HOME=[コピーしたパス]`を入力
      - `export PATH=${JAVA_HOME}/bin:${PATH}`を入力
      - 参考サイトは[こちら](https://qiita.com/niwasawa/items/460ccd0fa0041e7a24911)


### 開発環境のインストール

- [こちら](https://www.jetbrains.com/ja-jp/idea/download/other.html)から`Intellij IDEA Community Edition`をインストールします。
  - File -> New -> Project -> Project from existing source -> `beginner/demo/demo` -> import project from external model -> `Gradle` -> Create
  - files -> Project Structure -> Platform Settings -> SDKs -> `11`を選択してください -> OK
  - [参考画像](https://github.com/amajakai14/training-warehouse-management/blob/step1-client-and-server/intellij.md)

- [こちら](https://code.visualstudio.com/)から`VSCode`をインストールします。
  - 下記の拡張機能をインストールしておいて下さい。
      - HTML CSS Support
      - Javascript (ES6) code snippets
      - Live Server
  - [参考サイト](https://qiita.com/KNR109/items/5f933df1292564e6dc70)

- [こちら](https://docs.docker.com/desktop/install/windows-install/)から`Docker Desktop` をインストールします。
  - [参考サイト](https://www.kagoya.jp/howto/cloud/container/wsl2_docker/)

### データベースの起動

Tutorialに移る前にDockerを起動しておく必要があります。
- `Git Bash`もしくは `terminal`を起動します。
- `cd`コマンドで `training-warehouse-management-JP` に移動します。  
- こちらのコマンドを入力し、.shファイルを実行して下さい。
  `./beginner/demo/demo/local/start.sh`  
  .shファイルの詳しい実行方法については[こちら](https://linuxfan.info/post-1486)を参考にして下さい。

## クライアントサイドとサーバーサイド

このプロジェクトでは、コードを２つのパートに分割しています。
- クライアントサイド 
&nbsp;… クライアントで表示または実行されるWebアプリケーションの全てを指します。今回のプロジェクトでは、HTML, CSS, JavaScriptで記述されています。
ユーザーが直感的に操作できるようにUIを提供します。

- サーバーサイド  
&nbsp;… サーバーで動くプログラムなどを指します。
今回のプロジェクトでは、Javaで記述されています。
クライアント側から送られてきたアクションを受け取り、ストレージへのデータの保存などを行います。
（このプロジェクトでは、ストレージにPostgresデータベースを利用します。）


## Tutorial
Javaコードは`IntelliJ`で、HTML,javascript,cssは`VScode`で編集しましょう。

ますは、サーバーを立ち上げましょう。  
intellijを起動 -> open -> training-warehouse-management-JP/beginner/demo/demo

`DemoApplication.java`を右クリック -> `Run DemoApplication.main()`  
terminalで
`Tomcat started on port(s): 8080 (http)`
と表示されれば、成功です。  
ブラウザで`localhost:8080/hello` と入力すると、
メッセージが表示されるはずです。

vscodeを起動 -> open -> training-warehouse-management-JP/beginner/ui  
`index.html`を右クリック -> `Open with Live Server`  
ブラウザでHTMLファイルが開きます。  
３つのボタンをクリックして、何が表示されるか見てみましょう。

次に`index.js`ファイルを開き、コードを読んでみましょう。  
ヒント :
 - 左のボタンは、Javaからのメッセージです。
`/beginner/demo/demo/src/main/java/controller.HelloController.java` を見ると良いでしょう。 
 - 真ん中のボタンは、JavaScriptからのメッセージです。  
`index.js`の1行目~3行目を見ると良いでしょう。

## Exercise
`index.js`の`helloExercise()`を編集し、
`ExerciseController.java`からのメッセージを表示させてみましょう。