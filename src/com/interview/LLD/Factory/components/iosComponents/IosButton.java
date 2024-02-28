package com.interview.LLD.Factory.components.iosComponents;


import com.interview.LLD.Factory.components.Button;

public class IosButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Changing size in ios device");
    }
}
