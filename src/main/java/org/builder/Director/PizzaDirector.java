package org.builder.Director;

/*
The Director defines how to build a specific type of object using the Builder.
It controls the construction process, while the Builder only knows how to build individual parts.

In our Pizza example:
    The Builder knows how to add cheese, crust, etc.
    The Director knows which combination makes a Margherita, Veggie, or Pepperoni pizza.
 */
public class PizzaDirector {
    private  Pizza.PizzBuilder builder;
    public PizzaDirector(Pizza.PizzBuilder builder){
        this.builder = builder;
    }
    // Predefined pizza recipes
    public Pizza buildMargheritaPizza() {
        return builder
                .setSize("Medium")
                .setCrustType("Thin Crust")
                .addCheese(true)
                .addMushrooms(false)
                .addPepperoni(false)
                .addOlives(false)
                .build();
    }

    public Pizza buildPepperoniDeluxePizza() {
        return builder
                .setSize("Large")
                .setCrustType("Cheese Burst")
                .addCheese(true)
                .addMushrooms(true)
                .addPepperoni(true)
                .addOlives(true)
                .build();
    }
}
