package bevpackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoffeeTestStudent {
    @Test
    public void testCalcPrice() {
        Coffee coffee = new Coffee("Espresso", Size.MEDIUM, true, true);
        assertEquals(3.5, coffee.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Coffee coffee1 = new Coffee("Latte", Size.SMALL, false, false);
        Coffee coffee2 = new Coffee("Latte", Size.SMALL, false, false);
        assertTrue(coffee1.equals(coffee2));
    }

    @Test
    public void testToString() {
        Coffee coffee = new Coffee("Cappuccino", Size.LARGE, false, true);
        assertTrue(coffee.toString().contains("Cappuccino"));
    }
}
