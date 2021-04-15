package edu.sabana.poob.shapes;

public class Cylinder extends Circle implements GeometricShape3D {

    private double height;

    public Cylinder(double radius,double height) throws ShapeException {
        super(radius);
        if (radius <= 0|| height<=0)
            throw new ShapeException(ShapeException.BAD_DIMENSION_SIDE);
        this.height = height;
    }

    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return height*getArea();
    }

    @Override
    public double getSuperficialArea() {
        return getPerimeter()*height+2*getArea();
    }
}
