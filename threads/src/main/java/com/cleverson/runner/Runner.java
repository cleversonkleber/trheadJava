package com.cleverson.runner;

public class Runner implements Runnable{

    private Race race;
    private String runner;



    public Runner(Race race, String runner){
        super();
        this.race =  race;
        this.runner = runner;
    }

    

    @Override
    public void run() {
        System.out.println(runner + "running...");
        // System.out.println("Winner: "+runner);

        while (!race.isFinished()) {
            race.setFinished(true);
            System.out.println("Winner:"+ runner);
            return;
        }
        System.out.println(runner+" lost :(");


    }

}
