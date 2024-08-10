package com.cleverson.printhello;

public class PrintHelloTask implements Runnable {
    private String nome;

    public PrintHelloTask(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + this.getNome() + "!");
    }

}
