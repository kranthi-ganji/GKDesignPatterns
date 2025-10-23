package org.builder.Director;

public class Pizza {
    private String size; // small,medium,large
    private String crustType;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean olives;

    private Pizza(PizzBuilder pizzaBuilder){
        this.size = pizzaBuilder.size;
        this.crustType = pizzaBuilder.crustType;
        this.cheese = pizzaBuilder.cheese;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.mushrooms = pizzaBuilder.mushrooms;
        this.olives = pizzaBuilder.olives;
    }
    public String pizaaDetails(){
        return "Pizza [size=" + size + ", crustType=" + crustType +
                ", cheese=" + cheese + ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms + ", olives=" + olives + "]";
    }

    // Inner static Builder class
    public static class PizzBuilder{
        private String size; // small,medium,large
        private String crustType;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        private boolean olives;

        public PizzBuilder setSize(String size){
            this.size = size;
            return this;
        }
        // this refers to the current object — in this case, the current PizzaBuilder instance.
        //To enable method chaining — a style where you can call multiple methods in one line.
        public PizzBuilder setCrustType(String crustType){
            this.crustType = crustType;
            return this;
        }
        public PizzBuilder addCheese(Boolean cheese ){
            this.cheese = cheese;
            return this;
        }
        public PizzBuilder addPepperoni(Boolean pepperoni ){
            this.pepperoni = pepperoni;
            return this;
        }
        public PizzBuilder addMushrooms(Boolean mushrooms ){
            this.mushrooms = mushrooms;
            return this;
        }
        public PizzBuilder addOlives(Boolean olives ){
            this.olives = olives;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }

    }

}
