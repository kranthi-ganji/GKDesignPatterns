package org.Factory;

public class Triangle implements Polygon{
    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing the triangle");
    }
}
