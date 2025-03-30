package EXCEPTIONS;

import java.util.Scanner;
class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    
    public static boolean isValidProduct(String name, double price, int quantity) {
        try{
            validateName(name);
            validatePrice(price);
            validateQuantity(quantity);
            return true;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
        
    public static void validateName(String name){
        if(name.length()>25){
            throw new IllegalArgumentException("Product name should be 25 characters or less");
        }
    }
    public static void validatePrice(double price){
        if(price<=0){
            throw new IllegalArgumentException("Price should be a positive value");
        }
    }
    public static void validateQuantity(int quantity){
        if(quantity<0){
            throw new IllegalArgumentException("Quantity should be a non-negative integer");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        double price1 = scanner.nextDouble();
        int quantity1 = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        String name2 = scanner.nextLine();
        double price2 = scanner.nextDouble();
        int quantity2 = scanner.nextInt();

        Product pro1 = new Product(name1, price1, quantity1);
        Product pro2 = new Product(name2, price2, quantity2);

        if (pro1.isValidProduct(name1, price1, quantity1)) {
            System.out.println("Product 1 details are valid");
        } else {
            System.out.println("Product 1 details are not valid");
        }

        if (pro2.isValidProduct(name2, price2, quantity2)) {
            System.out.println("Product 2 details are valid");
        } else {
            System.out.println("Product 2 details are not valid");
        }

        scanner.close();
    }
}


