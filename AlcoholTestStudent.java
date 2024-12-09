package bevpackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class AlcoholTestStudent {
    @Test
    public void testCalcPrice() {
        Alcohol alcoholWeekday = new Alcohol("Wine", Size.SMALL, false);
        assertEquals(2.0, alcoholWeekday.calcPrice(), 0.01);

        Alcohol alcoholWeekend = new Alcohol("Beer", Size.SMALL, true);
        assertEquals(2.6, alcoholWeekend.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        Alcohol alcohol = new Alcohol("Vodka", Size.LARGE, true);
        assertTrue(alcohol.toString().contains("Vodka"));
    }

    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Vodka", Size.LARGE, true);
        Alcohol alcohol2 = new Alcohol("Vodka", Size.LARGE, true);
        assertTrue(alcohol1.equals(alcohol2));
    }
}









































































//;\
