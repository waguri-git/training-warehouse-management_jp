// Javascriptからのメッセージを表示
function helloFromJavascript() {
    alert("hello from javascript");
}

// Java(サーバー)からのメッセージを表示
async function helloFromJava() {
    // fetchにより、指定したエンドポイントとhttp通信する
    const response = await fetch("http://localhost:8080/hello");
    if (!response.ok) {
        alert("something wrong! have you run the server yet?");
        return;
    }
    const text = await response.text();
    alert(text);
}

// TODO: helloExercise()を完成させて、サーバーからのメッセージをアラートで表示する
async function helloExercise() {
    // alert("I'm not getting a message!");
    const response = await fetch("http://localhost:8080/exercise");
    if (!response.ok) {
        alert("something wrong! have you run the server yet?");
        return;
    }
    const text = await response.text();
    alert(text);
}

// fetchはクライアント（PC）からサーバーにリクエストを送る関数
// つまり、ここでJavaのHelloControllerクラスにhttpリクエストが飛んでいる
// ドットはオブジェクト内のキーを表している（.okや.text）
// キーは関数でもok（その場合はメソッドになる）
// オブジェクト名.キー名（変数もしくは関数）でオブジェクト内のキーに干渉できる
// if内のreturnはそこで処理を完結させているということ
// elseを使う場合、returnは消してif文後のプログラムをelse後に繋げることで代替できる
// asyncはawaitを使うために必要な記号のようなもの
// asyncとawaitはセットで同期処理を行う（時間のかかる処理でも終わるまで次の処理が始まるのを待つ）