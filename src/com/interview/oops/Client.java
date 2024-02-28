package com.interview.oops;

public class Client {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("abc");
        for(int i=0;i<6;i++){
            a.append(i);
        }
        System.out.println(a);


        B b =  new B();
        b.hello();

//        A a = new A();
//        a.hello();
    }
}
