package org.builder.Director;

public class PizzaClient {
    public static void main(String args[]){
        Pizza pizza = new Pizza.PizzBuilder().
                setSize("Large")
                .setCrustType("Chese Brust")
                .addCheese(true)
                .addMushrooms(true)
                .addOlives(true)
                .build();
        System.out.println(pizza.pizaaDetails());
    }
}
