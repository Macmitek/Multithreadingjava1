package com.interview.LLD.Factory;

import com.interview.LLD.Factory.components.Button;
import com.interview.LLD.Factory.components.Dropdown;
import com.interview.LLD.Factory.components.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
