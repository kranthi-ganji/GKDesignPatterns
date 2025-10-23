package org.abstractfactory.uifactory;

import org.abstractfactory.*;
import org.abstractfactory.UIFactory;
import org.abstractfactory.WinButton;
import org.abstractfactory.WinCheckBox;

public class WinUIfactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
