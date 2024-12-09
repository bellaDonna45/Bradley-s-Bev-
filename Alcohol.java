/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: A subclass of Beverage representing alcoholic drinks, with an extra weekend cost and age restrictions for ordering.
 * Due: 12/8/20244
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jade MEssina Belinga
*/

package bevpackage;

public class Alcohol extends Beverage {
    private boolean weekend;
    public static final double WEEKEND_COST = 0.6;

    public Alcohol(String name, Size size, boolean weekend) {
        super(name, Type.ALCOHOL, size);
        this.weekend = weekend;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        if (weekend) price += WEEKEND_COST;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekend: " + weekend + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Alcohol alcohol = (Alcohol) obj;
        return weekend == alcohol.weekend;
    }
}
