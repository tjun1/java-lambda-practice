package com.company.functional_impl3;

import java.util.function.Consumer;

public class Main {
    // Consumer<T>で引数の型を指定して利用できる
    // void accept(T)で実行できる
    // 戻り値を必要としないときはこれを使えばよいか
    // 引数を2つ使うときは BiConsumerインターフェイスがある
    public static void main(String[] args) {
        Consumer<String> buyer = (goods) -> {
            System.out.println(goods + "を購入しました");
        };
        buyer.accept("おにぎり");
    }
}
