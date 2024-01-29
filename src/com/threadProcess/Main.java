package com.threadProcess;

public class Main {
    public static void main(String[] args) {


        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        //helloWorldPrinter.run();
        // 2. Put that instance in an object of Thread
        Thread t = new Thread(helloWorldPrinter);
        // 3. Start the thread (it just tells the cpu that I want to run this thread)
        t.start();

    }
}
