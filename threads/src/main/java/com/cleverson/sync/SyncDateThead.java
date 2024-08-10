package com.cleverson.sync;

public class SyncDateThead implements Runnable {

    private Data data;

    public SyncDateThead(Data data) {
        super();
        this.data = data;
    }

    @Override
    public void run() {
        data.sync();
    }

}
