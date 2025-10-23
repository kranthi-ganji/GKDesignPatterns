package org.abstractfactory;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is windows button");
    }
}
