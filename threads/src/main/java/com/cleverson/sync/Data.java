package com.cleverson.sync;

public class Data {

    private boolean outOfSync;
    private int value;

    public boolean isOutOfSync() {
        return outOfSync;
    }

    public void setOutOfSync(boolean outOfSync) {
        this.outOfSync = outOfSync;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void sync() {

        try {
            if (!outOfSync) {
                this.wait();
            }
            outOfSync = false;

            Thread.sleep(5000);
            System.out.println("Syncronized!");
            this.notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized void read() {
        System.out.println("Reading data...");

        try {
            if (outOfSync)
                this.wait();
            Thread.sleep(2000);
            System.out.println("Data: " + value);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
