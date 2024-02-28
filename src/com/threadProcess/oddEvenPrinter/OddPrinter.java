package com.threadProcess.oddEvenPrinter;

public class OddPrinter implements Runnable{
    private  NumberPrinter np;
    private int max;
    public OddPrinter(NumberPrinter numberPrinter, int i) {
        this.np = numberPrinter;
        this.max = i;
    }
    @Override
    public void run() {
        for(int i=1;i<=max;i+=2){
            try{
                np.printOdd(i);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
