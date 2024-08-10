package com.cleverson.counter;


public class Main {
    public static void main(String[] args) {





        System.out.println("\n\n============= Counter ==============\n");

        var counter = new CounterTask();
        Thread counter1 = new Thread(counter);
        Thread counter2 = new Thread(counter);
        Thread counter3 = new Thread(counter);
        Thread counter4 = new Thread(counter);

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();

    }
}