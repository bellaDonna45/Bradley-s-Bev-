package bevpackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTestStudent {
    @Test
    public void testCopyConstructor() {
        Customer original = new Customer("Charlie", 28);
        Customer copy = new Customer(original);
        assertEquals(original, copy);
    }

    @Test
    public void testToString() {
        Customer customer = new Customer("Diana", 32);
        assertTrue(customer.toString().contains("Diana"));
    }

    @Test
    public void testEquals() {
        Customer customer1 = new Customer("Eve", 22);
        Customer customer2 = new Customer("Eve", 22);
        assertTrue(customer1.equals(customer2));
    }
}
