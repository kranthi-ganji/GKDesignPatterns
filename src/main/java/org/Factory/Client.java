package org.Factory;

public class Client {
    public static void main(String[] args) {
        //Triangle
        Polygon triangle = PolygonFactory.getInstance(3);
        System.out.println(triangle.getType());
        triangle.drawShape();
        //Square
        Polygon square = PolygonFactory.getInstance(4);
        System.out.println(square.getType());
        //Pentagon
        Polygon pentagon = PolygonFactory.getInstance(5);
        System.out.println(pentagon.getType());

    }
}
/*
The Factory Pattern is a creational design pattern that provides a way to create objects
without exposing the creation logic to the client.
Instead of calling a constructor directly (new), you use a factory method.

--> Think of it like a factory in real life — you order a product (object),
but you don’t need to know how it’s made inside.

WHY TO USE
1.You have multiple classes implementing the same interface.
2.You want to hide object creation logic
3.You want to make code extensible and maintainable

ADVANTAGES
    Loose coupling between client and actual classes
    Centralized object creation logic
    Easy to add new product types
 */
