package org.abstractfactory.uifactory;

import org.abstractfactory.Button;
import org.abstractfactory.CheckBox;
import org.abstractfactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkbox;
    public Application(UIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }
    public void uiInterface() {
        button.paint();
        checkbox.select();
    }
}
