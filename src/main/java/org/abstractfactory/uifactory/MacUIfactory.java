package org.abstractfactory.uifactory;

import org.abstractfactory.*;
import org.abstractfactory.MacButton;
import org.abstractfactory.MacCheckBox;
import org.abstractfactory.UIFactory;


public class MacUIfactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
