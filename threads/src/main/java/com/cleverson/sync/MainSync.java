package com.cleverson.sync;

public class MainSync {
    public static void main(String[] args) {

        System.out.println("\n\n============= Counter ==============\n");

        var data = new Data();
        data.setOutOfSync(true);
        Thread read = new Thread(new ReadDataThread(data));
        Thread sync = new Thread(new SyncDateThead(data));

        read.start();
        sync.start();

    }
}