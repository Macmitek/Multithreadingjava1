package com.interview.LLD.Factory;

import com.interview.LLD.Factory.android.AndroidFactory;
import com.interview.LLD.Factory.ios.IosFactory;

public class UIFactoryFactory {
    public static UIFactory createFactoryBasedOnPlatform(SupportedPlatform supportedPlatform) {
        return switch (supportedPlatform) {
            case IOS -> new IosFactory();
            case ANDROID -> new AndroidFactory();
            default -> new AndroidFactory();
        };
    }
}
