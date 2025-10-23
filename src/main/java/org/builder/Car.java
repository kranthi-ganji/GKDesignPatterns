package org.builder;
/*
The Builder pattern is used to create complex objects step-by-step instead of
calling a constructor with too many parameters.

--> It’s useful when:
--> The object has many optional fields.
--> You don’t want to use a long constructor (known as telescoping constructor problem).

 */
public class Car {
    private String engine;
    private String seats;
    private boolean sunroof;
    private boolean gps;
    private String color;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
        this.color = builder.color;
    }

    public String showCarDetails() {
        return "Car [engine=" + engine + ", seats=" + seats +
                ", sunroof=" + sunroof + ", gps=" + gps + ", color=" + color + "]";
    }

    //Inner Builder class
    public static class CarBuilder {
        private String engine;
        private String seats;
        private boolean sunroof;
        private boolean gps;
        private String color;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(String seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setGPS(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
