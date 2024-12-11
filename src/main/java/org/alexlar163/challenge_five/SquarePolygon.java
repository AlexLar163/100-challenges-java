package org.alexlar163.challenge_five;

public class SquarePolygon implements Polygon {
    Double side;

    SquarePolygon(Double side) {
        this.side = side;
    }

    @Override
    public Double area() {
        return side * side;
    }

    @Override
    public void printArea() {
        System.out.println("El area del Cuadrado es: " + area());
    }
}
