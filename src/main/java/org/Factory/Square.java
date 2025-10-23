package org.Factory;

public class Square implements Polygon{
    @Override
    public String getType() {
        return "Square";
    }
    public void drawShape() {
        System.out.println("Drawing the square");
    }
}



