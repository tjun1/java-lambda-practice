package com.company.interface_impl;

public class Main {
    public static void main(String[] args) {
        class Local implements Runnable {
            @Override
            public void run() {
                System.out.println("Hello Lambda2!!");
            }
        }
        Runnable runner = new Local();
        runner.run();
    }
}
