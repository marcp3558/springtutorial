package com.example;

public class MyThread implements Runnable {
    private String str;

    public MyThread(String str) {
        this.str = str;
    }

    public void run() {
        doit();
    }

    private synchronized void doit() {
        for (var i = 0; i < 100; i++) {
            System.out.println(str + " " + i);
        }

        System.out.println(str + " done");
    }
}
