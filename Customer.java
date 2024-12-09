/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Represents a customer with attributes for name and age, along with methods to handle customer data.
 * Due: 12/8/20244
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Jade MEssina Belinga
*/

package bevpackage;

public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer(Customer customer) {
        this.name = customer.name;
        this.age = customer.age;
    }

    @Override
    public String toString() {
        return name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return age == customer.age && name.equals(customer.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

