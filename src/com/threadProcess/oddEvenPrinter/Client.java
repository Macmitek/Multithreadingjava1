package com.threadProcess.oddEvenPrinter;

public class Client {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        Thread oddthread =  new Thread(new OddPrinter(numberPrinter,20));
        Thread eventhread =  new Thread(new EvenPrinter(numberPrinter,20));
        oddthread.start();
        eventhread.start();
    }
}
