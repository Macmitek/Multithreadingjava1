package com.interview.LLD.Factory.components.androidComponents;


import com.interview.LLD.Factory.components.Button;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Changing size in android device");
    }
}
