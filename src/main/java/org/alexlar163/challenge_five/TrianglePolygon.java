package org.alexlar163.challenge_five;

public class TrianglePolygon implements Polygon {
    private final Double base;
    private final Double height;

    TrianglePolygon(Double base, Double height){
        this.base = base;
        this.height = height;
    }


    @Override
    public Double area() {
        return (this.base * this.height) / 2;
    }

    @Override
    public void printArea() {
        System.out.println("El del Triangulo es: " + this.area());
    }
}
