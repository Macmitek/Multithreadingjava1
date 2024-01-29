package com.squarePrinter;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Executor executor  = Executors.newSingleThreadExecutor();
        Executor executor  = Executors.newFixedThreadPool(100);
        //Executor executor  = Executors.newCachedThreadPool();

        for (int i = 1; i <= n; i++) {
//            Thread thread = new Thread(new squarePrinter(value));
//            thread.start();
            executor.execute(new numberPrinter(i));
        }

    }
}
