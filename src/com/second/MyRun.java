package com.second;

public class MyRun implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i = 0; i < 200; ++ i) {
            System.out.println(t.getName() + "HelloWorld!");
        }
    }
}
