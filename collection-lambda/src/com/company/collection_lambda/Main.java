package com.company.collection_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};
        List<Integer> numberList = new ArrayList<>();
        for (int n : numbers) {
            numberList.add(n);
        }
        // 通常は sort() のメソッドだけでできるんだけど、、実験として
//        Collections.sort(numberList);
        Collections.sort(numberList, (a, b) -> {
            return a * a - b * b;
        });
        System.out.println(numberList);
    }
}
