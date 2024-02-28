package com.interview.LLD.Factory.android;

import com.interview.LLD.Factory.UIFactory;
import com.interview.LLD.Factory.components.androidComponents.AndroidButton;
import com.interview.LLD.Factory.components.androidComponents.AndroidDropdown;
import com.interview.LLD.Factory.components.androidComponents.AndroidMenu;

public class AndroidFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
