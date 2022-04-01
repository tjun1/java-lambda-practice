package com.company.stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, 0, -3, 8};
        List<Integer> numberList = new ArrayList<>();
        for (int n : numbers) {
            numberList.add(n);
        }
        numberList.stream().forEach((i) -> {
            System.out.print(i + " ");
        });
    }
}
