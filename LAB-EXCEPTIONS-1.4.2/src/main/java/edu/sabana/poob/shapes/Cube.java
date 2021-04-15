package edu.sabana.poob.shapes;

public class Cube extends RectangleSolid implements GeometricShape3D {

    private double side = 1;

    public Cube(double side) throws ShapeException {

        if (side <= 0)
            throw new ShapeException(ShapeException.BAD_DIMENSION_SIDE);

        this.side = side;
    }
    public Cube()
   {

   }
   public Cube(String color)
   {
       super(color);
   }

   public Cube(String color, double side)
   {
       super(color,side,side,side);
   }

}
