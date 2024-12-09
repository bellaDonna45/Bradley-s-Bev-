package bevpackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class SmoothieTestStudent {
    @Test
    public void testCalcPrice() {
        Smoothie smoothie = new Smoothie("Mango", Size.LARGE, 3, true);
        assertEquals(6.0, smoothie.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Smoothie smoothie1 = new Smoothie("Berry", Size.SMALL, 2, false);
        Smoothie smoothie2 = new Smoothie("Berry", Size.SMALL, 2, false);
        assertTrue(smoothie1.equals(smoothie2));
    }

    @Test
    public void testToString() {
        Smoothie smoothie = new Smoothie("Banana", Size.MEDIUM, 1, false);
        assertTrue(smoothie.toString().contains("Banana"));
    }
}