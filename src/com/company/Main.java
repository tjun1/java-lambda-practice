package com.company;

public class Main {

    public static void main(String[] args) {
        class Local {
            public void sayHello() {
                System.out.println("Hello");
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}

