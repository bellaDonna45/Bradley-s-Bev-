/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: A subclass of Beverage representing coffee, with optional extras for extra shot and syrup, each adding to the price.
 * Due: 12/8/20244
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jade MEssina Belinga
*/


package bevpackage;

public class Coffee extends Beverage {
    private boolean extraShot;
    private boolean extraSyrup;
    public static final double EXTRA_COST = 0.5;

    public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
        super(name, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        if (extraShot) price += EXTRA_COST;
        if (extraSyrup) price += EXTRA_COST;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Extra shot: " + extraShot + ", Extra syrup: " + extraSyrup + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Coffee coffee = (Coffee) obj;
        return extraShot == coffee.extraShot && extraSyrup == coffee.extraSyrup;
    }
}


