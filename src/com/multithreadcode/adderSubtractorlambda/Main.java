package com.multithreadcode.adderSubtractorlambda;

import com.multithreadcode.adderSubtrator.Value;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();
        String myName = "Mitesh";

        ExecutorService es = Executors.newCachedThreadPool();


        Callable<Void> adderLambda = () -> {
            for (int i = 1; i <= 5000; ++i) {
                l.lock();
                v.value += i;
                l.unlock();
            }
            return null;
        };



        Callable<Void> subtractorLambda = () -> {
            for (int i = 1; i <= 5000; ++i) {
                l.lock();
                v.value -= i;
                l.unlock();
            }
            return null;
        };

        Future<Void> adderFuture = es.submit(adderLambda);
        Future<Void> subtractorFuture = es.submit(subtractorLambda);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
