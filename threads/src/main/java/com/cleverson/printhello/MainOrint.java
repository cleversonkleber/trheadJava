package com.cleverson.printhello;

import com.cleverson.sync.Data;
import com.cleverson.sync.ReadDataThread;
import com.cleverson.sync.SyncDateThead;

public class MainOrint {
    public static void main(String[] args) {

        System.out.println("\n\n==================== sync ===================\n");

        Data data = new Data();

        data.setOutOfSync(true);
        Thread readData = new Thread(new ReadDataThread(data));
        Thread syncData = new Thread(new SyncDateThead(data));
        readData.start();

        syncData.start();

    }
}