package org.builder;

public class Client {
    public static void main(String args[]){
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setSeats("Leather")
                .setSunroof(true)
                .setGPS(true)
                .setColor("Red")
                .build();

        System.out.println(car.showCarDetails());
    }
}
