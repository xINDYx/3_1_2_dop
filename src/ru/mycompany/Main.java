package ru.mycompany;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener onErrorListener = System.out::println;

        Worker worker = new Worker(listener, onErrorListener);
        worker.start();
    }
}
