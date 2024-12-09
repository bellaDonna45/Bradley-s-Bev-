/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Represents a single order, including the order number, customer details, beverages list, and methods to calculate the total cost or compare orders.
 * Due: 12/8/20244
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jade MEssina Belinga
*/

package bevpackage;
import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
    private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer customer) {
        this.orderNumber = getOrderNumber();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer);
        this.beverages = new ArrayList<>();
    }

    public int getOrderNumber() {
        Random random = new Random();
        return 10000 + random.nextInt(80001);
    }

    public void addNewBeverage(String name, Size size, boolean extraShot, boolean extraSyrup) {
        beverages.add(new Coffee(name, size, extraShot, extraSyrup));
    }

    public void addNewBeverage(String name, Size size) {
        beverages.add(new Alcohol(name, size, orderDay == Day.SATURDAY || orderDay == Day.SUNDAY));
    }

    public void addNewBeverage(String name, Size size, int numOfFruits, boolean proteinPowder) {
        beverages.add(new Smoothie(name, size, numOfFruits, proteinPowder));
    }

    public Beverage getBeverage(int index) {
        return beverages.get(index);
    }

    public int getTotalItems() {
        return beverages.size();
    }

    public double calcOrderTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.orderNumber, other.orderNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNumber)
          .append(", Time: ").append(orderTime)
          .append(", Day: ").append(orderDay)
          .append(", Customer: ").append(customer)
          .append(", Beverages: ").append(beverages);
        return sb.toString();
    }

    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    public int findNumOfBeveType(Type type) {
        int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
    }
}






























































//;}
