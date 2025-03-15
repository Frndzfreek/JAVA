package OOPs;
class Car {
    String make; // Instance variables
    String model;
    int year;

    // Constructor
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year of Manufacture: " + year);
    }
}

// Main class to test the Car class
public class Cars {
    public static void main(String[] args) {
        // Create objects of the Car class using the constructor
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Display details of each car
        car1.displayDetails();
        System.out.println(); // Blank line
        car2.displayDetails();
    }
}
