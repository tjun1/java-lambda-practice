package com.company.lambda_impl2;

public class Main {
    // method() は Runnable インターフェイスを実装してるものを引数に取れる
    // 引数オブジェクトは run() を実装していることが保証されてるので呼べる
    // なのでラムダ式を渡すだけで実行される
    public static void main(String[] args) {
        method(() -> {
            System.out.println("Hello Lambda5");
        });
    }

    public static void method(Runnable r) {
        r.run();
    }
}
