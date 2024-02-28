package com.interview.LLD.Factory.ios;

import com.interview.LLD.Factory.UIFactory;
import com.interview.LLD.Factory.components.iosComponents.IosButton;
import com.interview.LLD.Factory.components.iosComponents.IosDropdown;
import com.interview.LLD.Factory.components.iosComponents.IosMenu;

public class IosFactory implements UIFactory {

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }
}
