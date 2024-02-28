package com.interview.LLD.Factory;

import com.interview.LLD.Factory.components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory factory = flutter.createFactory(SupportedPlatform.ANDROID);
        Button button = factory.createButton();
        button.changeSize();
    }
}
