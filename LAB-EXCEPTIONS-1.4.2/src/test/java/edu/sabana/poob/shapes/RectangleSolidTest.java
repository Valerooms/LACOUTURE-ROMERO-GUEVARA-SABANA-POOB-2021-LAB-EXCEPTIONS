package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleSolidTest {
    private static RectangleSolid rs1;
    private static RectangleSolid rs2;
    private static RectangleSolid rs3;

    @BeforeAll
    public static void setUp() {
        rs1 = new RectangleSolid();
        rs2 = new RectangleSolid("red",10,2,4);
        rs3 = new RectangleSolid("blue", 2,2,2);}

    @Test
    public void shouldCalculateVolume() {

        assertEquals(1, (int) rs1.getVolume());
        assertEquals(80, (int) rs2.getVolume());
        assertEquals(8, (int) rs3.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(6, (int) rs1.getSuperficialArea());
        assertEquals(136, (int) rs2.getSuperficialArea());
        assertEquals(24, (int) rs3.getSuperficialArea());
    }
    @Test
    public void shouldNotRectangleSolidwithSidesNegative() {

        try {
            new RectangleSolid(-1,1,1);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }

        try {
            new RectangleSolid(1,-1,1);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }
        try {
            new RectangleSolid(1,1,-1);
        } catch (ShapeException e) {
            assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        }
    }

    @Test
    public void shouldNotRectangleSolidwithSidesZero() {

        Exception e = assertThrows(ShapeException.class, () -> new RectangleSolid(1,0,0));
        assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        Exception e1 = assertThrows(ShapeException.class, () -> new RectangleSolid(0,1,1));
        assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());
        Exception e2 = assertThrows(ShapeException.class, () -> new RectangleSolid(0,0,1));
        assertEquals(ShapeException.BAD_DIMENSION_SIDE, e.getMessage());

    }
}
