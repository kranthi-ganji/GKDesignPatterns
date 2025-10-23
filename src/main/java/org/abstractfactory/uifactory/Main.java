package org.abstractfactory.uifactory;

import org.abstractfactory.UIFactory;

public class Main {
    public static void main(String args[]){
        UIFactory factory;
        String os = "windows"; // imagine reading from config

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WinUIfactory();
        } else {
            factory = new MacUIfactory();
        }

        Application app = new Application(factory);
        app.uiInterface();
    }
}
