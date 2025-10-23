package org.Factory;

public class Pentagon implements Polygon{
    @Override
    public String getType() {
        return "Pentagn";
    }
    public void drawShape() {
        System.out.println("Drawing the pentagon");
    }
}
