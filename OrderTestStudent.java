package bevpackage;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent {
    private Order order;

    @Before
    public void setUp() {
        Customer customer = new Customer("Eve", 22);
        order = new Order(14, Day.FRIDAY, customer);
    }

    @Test
    public void testAddNewBeverage() {
        order.addNewBeverage("Mocha", Size.MEDIUM, true, true);
        assertEquals(1, order.getTotalItems());
    }

    @Test
    public void testCalcOrderTotal() {
        order.addNewBeverage("Latte", Size.LARGE, false, true);
        order.addNewBeverage("Smoothie", Size.SMALL, 1, false);
        assertEquals(6.0, order.calcOrderTotal(), 0.01);
    }

    @Test
    public void testIsWeekend() {
        assertFalse(order.isWeekend());

        Order weekendOrder = new Order(12, Day.SATURDAY, new Customer("Alice", 25));
        assertTrue(weekendOrder.isWeekend());
    }

    @Test
    public void testFindNumOfBevType() {
        order.addNewBeverage("Latte", Size.LARGE, false, true);
        order.addNewBeverage("Smoothie", Size.SMALL, 1, false);
        order.addNewBeverage("Wine", Size.SMALL, false, false);
        assertEquals(2, order.findNumOfBeveType(Type.COFFEE));
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE));
        assertEquals(0, order.findNumOfBeveType(Type.ALCOHOL));
    }
}

