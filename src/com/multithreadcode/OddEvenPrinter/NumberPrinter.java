package com.multithreadcode.OddEvenPrinter;

import java.util.concurrent.Semaphore;

public class NumberPrinter {
    private Semaphore semEven = new Semaphore(0);
    private Semaphore semOdd = new Semaphore(1);
    void printEven(int num) throws InterruptedException {
        semEven.acquire();
        System.out.println(Thread.currentThread().getName() + ":: " +num);
        semOdd.release();
    }
    void printOdd(int num) throws InterruptedException {
        semOdd.acquire();
        System.out.println(Thread.currentThread().getName() + ":: " +num);
        semEven.release();
    }
}
class Even implements  Runnable{
    private NumberPrinter np;
    private int max;

    public Even(NumberPrinter numberPrinter, int i) {
        this.np = numberPrinter;
        this.max = i;
    }

    @Override
    public void run() {
        for(int i=2;i<=max;i+=2){
            try {
                np.printEven(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Odd implements  Runnable{
    private NumberPrinter np;
    private int max;

    public Odd(NumberPrinter numberPrinter, int i) {
        this.np = numberPrinter;
        this.max = i;
    }

    @Override
    public void run() {
        for(int i=1;i<=max;i+=2){
            try {
                np.printOdd(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
