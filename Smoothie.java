/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: A subclass of Beverage representing smoothies, allowing additional fruits and protein powder, both increasing the price.
 * Due: 12/8/20244
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jade MEssina Belinga
*/

package bevpackage;

public class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean proteinPowder;
    public static final double PROTEIN_COST = 1.5;
    public static final double FRUIT_COST = 0.5;

    public Smoothie(String name, Size size, int numOfFruits, boolean proteinPowder) {
        super(name, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        this.proteinPowder = proteinPowder;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        price += numOfFruits * FRUIT_COST;
        if (proteinPowder) price += PROTEIN_COST;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fruits: " + numOfFruits + ", Protein: " + proteinPowder + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Smoothie smoothie = (Smoothie) obj;
        return numOfFruits == smoothie.numOfFruits && proteinPowder == smoothie.proteinPowder;
    }
}
