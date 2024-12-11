/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

package org.alexlar163.challenge_five;

public class ChallengeFive {
    public static void main(String[] args) {
        RectanglePolygon rectanglePolygon = new RectanglePolygon(10.0, 11.0);
        area(rectanglePolygon);

        SquarePolygon squarePolygon = new SquarePolygon(5.0);
        area(squarePolygon);

        TrianglePolygon trianglePolygon = new TrianglePolygon(5.0, 11.0);
        area(trianglePolygon);
    }


    public static void area(Polygon polygon) {
        polygon.printArea();
    }


}
