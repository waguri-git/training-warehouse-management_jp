package com.excellence.demo.model;

public class ValidateResult {
    private final boolean ok;
    private final String errorMessage;

    public boolean ok() {
        return ok;
    } //真偽値メソッド

    public String errorMessage() {
        return errorMessage;
    }//エラーメッセージを返すメソッド

    public static ValidateResult success() {
        return new ValidateResult(true, "");
    }

    public static ValidateResult failed(String text) {
        return new ValidateResult(false, text);
    }

    private ValidateResult(boolean ok, String message) {
        this.ok = ok;
        this.errorMessage = message;
    }
}