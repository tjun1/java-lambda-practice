package com.company.functional_impl4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // boolean で戻り値が欲しいときは Predicate<T> を使う
        // 戻り値は boolean test(T) を実行すればよい
        Predicate<String> checker = (s) -> {
            return s.equals("Java");
        };
        boolean result = checker.test("Java");
        System.out.println(result);
    }
}
