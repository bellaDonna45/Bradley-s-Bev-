/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: The abstract base class for all beverages, storing common attributes like name, type, size, and methods for calculating base price and abstract price calculation.
 * Due: 12/8/20244
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jade MEssina Belinga
*/
package bevpackage;

public abstract class Beverage {
    private String name;
    private Type type;
    private Size size;
    public static final double BASE_PRICE = 2.0;
    public static final double SIZE_PRICE = 0.5;

    public Beverage(String name, Type type, Size size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public abstract double calcPrice();

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public double addSizePrice() {
        switch (size) {
            case SMALL:
                return BASE_PRICE;
            case MEDIUM:
                return BASE_PRICE + SIZE_PRICE;
            case LARGE:
                return BASE_PRICE + 2 * SIZE_PRICE;
            default:
                return BASE_PRICE;
        }
    }
    @Override
    public String toString() {
        return name + ", " + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Beverage beverage = (Beverage) obj;
        return name.equals(beverage.name) && type == beverage.type && size == beverage.size;
    }
}




































































//;}
