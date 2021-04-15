package edu.sabana.poob.shapes;

public class Pyramid extends Triangle implements GeometricShape3D{

    private double height=1;

    public Pyramid() {
        super();

    }

    public Pyramid (double side1, double side2, double side3, double height) throws ShapeException {
        super(side1, side2, side3);
        if( side1<=0|| side2<=0||  side3<=0|| height<=0){
            throw new ShapeException(ShapeException.BAD_DIMENSION_SIDE);

        }
    }

    public Pyramid(String color, double side1, double side2, double side3, double height) {
        super(color, side1, side2, side3);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea()*height/3;
    }

    @Override
    public double getSuperficialArea() {
        return 4*getArea();
    }

}
