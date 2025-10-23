package org.builder.Director;

public class ClientDirector {
    public static void main(String args[]){
        Pizza.PizzBuilder builder = new Pizza.PizzBuilder();
        PizzaDirector director = new PizzaDirector(builder);
        Pizza margherita = director.buildMargheritaPizza();
        System.out.println("Margherita Pizza: " + margherita.pizaaDetails());

        Pizza deluxe = director.buildPepperoniDeluxePizza();
        System.out.println("Pepperoni Deluxe Pizza: " + deluxe.pizaaDetails());

    }
}
