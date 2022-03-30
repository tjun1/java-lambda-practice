package com.company.anon_class;

public class Main {
    public static void main(String[] args) {
        // Runnableインターフェイスからインスタンスを生成しているのではない
        // 実際は Runnable インターフェイスを実装した無名クラスの
        // インスタンスを生成しているだけ
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda3");
            }
        };

        runner.run();
    }
}
