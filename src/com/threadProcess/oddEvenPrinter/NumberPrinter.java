package com.threadProcess.oddEvenPrinter;

import java.util.concurrent.Semaphore;

public class NumberPrinter {
    Semaphore oddSema =  new Semaphore(1);
    Semaphore evenSema = new Semaphore(0);
    void printOdd(int num) throws  InterruptedException{
        oddSema.acquire();
        System.out.println("num oddprinter: "+num);
        evenSema.release();
    }
    void printEven(int num) throws InterruptedException{
        evenSema.acquire();
        System.out.println("num evenprinter: "+num);
        oddSema.release();
    }
}
