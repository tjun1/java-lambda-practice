package com.company.lambda_impl;

public class Main {
    public static void main(String[] args) {
        Runnable runner = () -> {
            System.out.println("Hello Lambda4");
        };
        runner.run();
    }
}
