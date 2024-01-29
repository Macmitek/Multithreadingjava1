package com.multithreadcode.numberPrinter;

public class NumberPrinter  implements  Runnable{
    public static int nextNumberToPrint = 1;
    @Override
    public void run(){
        System.out.println(nextNumberToPrint);
        nextNumberToPrint += 1;
    }
}
