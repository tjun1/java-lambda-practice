package com.company.functional_impl2;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // 2つの引数を受け取って値を返す関数インターフェイス
        BiFunction<Integer, Integer, Integer> adder = (a,b)-> {return a+b;};
        int result = adder.apply(1, 2);
        System.out.println(result);
    }
}
