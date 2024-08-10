package com.cleverson.counter;

public class CounterTask implements Runnable {

    private int counter;

    @Override
    public void run() {
        synchronized(this){
            this.counter++;
            System.out.println(Thread.currentThread().getName() + ":" + this.counter);
        }
    }

}
