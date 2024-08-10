package com.cleverson.runner;

public class RaceMain {
    public static void main(String[] args) {
        System.out.println("==========================================\n");
        Race race = new Race();
        Thread runner1 = new Thread(new Runner(race, "Runner 1"));
        Thread runner2 = new Thread(new Runner(race, "Runner 2"));
        Thread runner3 = new Thread(new Runner(race, "Runner 3"));
        Thread runner4 = new Thread(new Runner(race, "Runner 4"));
        System.out.println("Starting...");

        runner1.start();
        runner2.start();
        runner3.start();
        runner4.start();

    }

}
