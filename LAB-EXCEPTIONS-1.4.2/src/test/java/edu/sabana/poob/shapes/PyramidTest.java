package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PyramidTest {

    private static Pyramid p1;
    private static Pyramid p2;
    private static Pyramid p3;

    @BeforeAll
    public static void setUp() {
        p1 = new Pyramid();
        p2 = new Pyramid("blue",4,2,5,1);
        p3 = new Pyramid("red",15,15,15,15);}

    @Test
    public void shouldCalculateVolume() {

        assertEquals(0, (int) p1.getVolume());
        assertEquals(1, (int) p2.getVolume());
        assertEquals(562, (int) p3.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(2, (int) p1.getSuperficialArea());
        assertEquals(15, (int) p2.getSuperficialArea());
        assertEquals(450, (int) p3.getSuperficialArea());
    }
    @Test
    public void shouldNotCreatePyramidwithSidesandHeightNegative() {

        try {
            new Pyramid(-1,-1,1,2);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }

        try {
            new Pyramid(1,1,1,-2);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }
    }

    @Test
    public void shouldNotCreatePyramidwithSidesandHeightZero() {

        Exception e = assertThrows(ShapeException.class, () -> new Pyramid(1,1,1,0));
        assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());

        Exception e1 = assertThrows(ShapeException.class, () -> new Pyramid(0,0,0,1));
        assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
    }
}
