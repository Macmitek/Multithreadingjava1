package com.multithreadcode.OddEvenPrinter;



public class Main {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        Thread odd = new Thread(new Odd(numberPrinter,100),"Odd");
        Thread even = new Thread(new Even(numberPrinter,100),"Even");
        odd.start();
        even.start();
    }
}
