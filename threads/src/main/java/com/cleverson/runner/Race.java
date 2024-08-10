package com.cleverson.runner;

public class Race {
    // private boolean finished;
    private volatile boolean finished;

    public boolean isFinished(){
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    


}
