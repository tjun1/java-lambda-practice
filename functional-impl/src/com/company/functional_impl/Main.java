package com.company.functional_impl;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Function<T(引数の型),R(戻り値の型)>を使う
        Function<Integer, String> asterisker = (i) -> {
            return "*" + i;
        };
        String result = asterisker.apply(10);
        System.out.println(result);
    }
}
