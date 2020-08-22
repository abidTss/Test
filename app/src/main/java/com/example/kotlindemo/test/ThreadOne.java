package com.example.kotlindemo.test;

public class ThreadOne implements Runnable {
    final Object object;

    public ThreadOne(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (object) {
                if (i % 2 == 0)
                    System.out.println("Thread one : " + i);
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

        }

    }
}
