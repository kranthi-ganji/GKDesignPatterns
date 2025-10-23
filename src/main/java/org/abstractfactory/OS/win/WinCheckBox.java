package org.abstractfactory;

public class WinCheckBox implements CheckBox {
    @Override
    public void select() {
        System.out.println("This is windows CheckBox");
    }
}
