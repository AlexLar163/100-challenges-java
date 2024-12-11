package org.alexlar163.challenge_five;

public class RectanglePolygon implements Polygon {
    private final Double base;
    private final Double height;

    RectanglePolygon(Double base, Double height){
        this.base = base;
        this.height = height;
    }


    @Override
    public Double area() {
        return this.base * this.height;
    }

    @Override
    public void printArea() {
        System.out.println("El Area del rectangulo es: " + this.area());
    }
}
