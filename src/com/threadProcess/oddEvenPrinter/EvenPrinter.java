package com.threadProcess.oddEvenPrinter;

public class EvenPrinter implements  Runnable {
    private  NumberPrinter np;
    private int max;
    public EvenPrinter(NumberPrinter numberPrinter, int i) {
        this.np = numberPrinter;
        this.max = i;
    }
    @Override
    public void run() {
        for(int i=2;i<=max;i+=2){
           try {
               np.printEven(i);
           }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
