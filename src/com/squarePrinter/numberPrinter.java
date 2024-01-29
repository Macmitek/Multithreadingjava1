package com.squarePrinter;

public class numberPrinter implements Runnable{
    private Integer num;

    public  numberPrinter(Integer num){
        this.num = num;
    }

    @Override
    public  void run(){
        System.out.println(num + " :: " + Thread.currentThread().getName());
    }
}
