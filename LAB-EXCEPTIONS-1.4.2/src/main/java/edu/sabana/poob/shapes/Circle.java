package edu.sabana.poob.shapes;

/**
 * Clase que define un Circulo. <br>
 * Un Circulo es una figura Shape, pero también implementa los comportamientos de una figura de dos dimensiones.
 */
public class Circle extends Shape implements GeometricShape2D {

    private double radius;
    public static final double PI = Math.PI;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) throws ShapeException {

        if (radius <= 0)
            throw new ShapeException(ShapeException.BAD_DIMENSION_SIDE);

        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getDiameter() {
        return this.radius*2;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*PI;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*this.radius;
    }
}
