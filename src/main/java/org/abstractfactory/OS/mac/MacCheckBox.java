package org.abstractfactory;

public class MacCheckBox implements CheckBox {
    @Override
    public void select() {
        System.out.println("This is mac checkbox");
    }
}
