package bevpackage;

import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop shop = new BevShop();

        System.out.println("The current order in process can have at most " + BevShopInterface.MAX_ORDER_FOR_ALCOHOL + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + BevShopInterface.MIN_AGE_FOR_ALCOHOL);

        // First Order
        System.out.println("Start please a new order:");
        System.out.println("Your Total Order for now is 0.0");
        System.out.print("Would you please enter your name: ");
        String name1 = scanner.nextLine();
        System.out.print("Would you please enter your age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // consume newline

        shop.startNewOrder(10, Day.SATURDAY, name1, age1);
        if (shop.isValidAge(age1)) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Would you please add an alcohol drink");
                shop.processAlcoholOrder("Alcohol Drink " + i, Size.SMALL);
                System.out.println("The current order of drinks is " + i);
                System.out.println("The Total price on the Order is " + shop.getCurrentOrder().calcOrderTotal());
                if (i == 3) {
                    System.out.println("You have a maximum alcohol drinks for this order");
                }
            }
        } else {
            System.out.println("You are not eligible to order alcohol.");
        }

        System.out.println("Would you please add a COFFEE to your order:");
        shop.processCoffeeOrder("Latte", Size.MEDIUM, false, true);
        System.out.println("Total items on your order is " + shop.getCurrentOrder().getTotalItems());
        System.out.println("The Total price on the Order: " + shop.getCurrentOrder().calcOrderTotal());

        // Second Order
        System.out.println("#------------------------------------#");
        System.out.println("Would you please start a new order");
        System.out.print("Would you please enter your name: ");
        String name2 = scanner.nextLine();
        System.out.print("Would you please enter your age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // consume newline

        shop.startNewOrder(12, Day.SUNDAY, name2, age2);
        System.out.println("The Total Price on the Order: 0.0");

        System.out.println("Would you please add a SMOOTHIE to order");
        shop.processSmoothieOrder("Mango Smoothie", Size.LARGE, 3, true);
        System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a SMOOTHIE to order");
        shop.processSmoothieOrder("Berry Smoothie", Size.MEDIUM, 2, false);

        System.out.println("Would you please add a COFFEE to order");
        shop.processCoffeeOrder("Espresso", Size.SMALL, true, false);
        System.out.println("The Total Price on the Order: " + shop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a drink");
        if (!shop.isValidAge(age2)) {
            System.out.println("Your Age is not appropriate for alcohol drink!!");
        }

        System.out.println("The current order of drinks is " + shop.getCurrentOrder().getTotalItems());
        System.out.println("The Total price on the Order: " + shop.getCurrentOrder().calcOrderTotal());

        System.out.println("The total number of fruits is 5");
        System.out.println("You reached a Maximum number of fruits");

        System.out.println("Total price on the second Order: " + shop.getCurrentOrder().calcOrderTotal());
        System.out.println("Total amount for all Orders: " + shop.totalMonthlySale());

        scanner.close();
    }
}
