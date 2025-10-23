package org.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is mac Button");
    }
}
