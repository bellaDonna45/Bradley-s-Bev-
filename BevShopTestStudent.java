package bevpackage;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {
    private BevShop shop;

    @Before
    public void setUp() {
        shop = new BevShop();
    }

    @Test
    public void testStartNewOrder() {
        shop.startNewOrder(10, Day.MONDAY, "Alice", 30);
        assertNotNull(shop.getCurrentOrder());
    }

    @Test
    public void testProcessAlcoholOrder() {
        shop.startNewOrder(10, Day.SATURDAY, "Bob", 25);
        shop.processAlcoholOrder("Whiskey", Size.MEDIUM);
        assertEquals(1, shop.getNumOfAlcoholDrink());
    }

    @Test
    public void testTotalMonthlySale() {
        shop.startNewOrder(10, Day.SATURDAY, "Alice", 30);
        shop.processCoffeeOrder("Espresso", Size.SMALL, true, false);
        assertEquals(2.5, shop.totalMonthlySale(), 0.01);
    }
}





























































//;]
