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