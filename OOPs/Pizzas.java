package Module3;
import java.util.Scanner;
class Pizza {
    double basePrice;
    double toppingCost;
    int numToppings;
  
    public Pizza(double basePrice, double toppingCost, int numToppings) {
        this.basePrice = basePrice;
        this.toppingCost = toppingCost;
        this.numToppings = numToppings;
    }
    public double calculatePrice() {
        return basePrice + (toppingCost * numToppings);
    }
}
class DiscountedPizza extends Pizza {
    public DiscountedPizza(double basePrice, double toppingCost, int numToppings) {
        super(basePrice, toppingCost, numToppings);
    }
    @Override
    public double calculatePrice() {
        double totalPrice = super.calculatePrice();
        if (numToppings > 3) {
            totalPrice *= 0.9;
        }
        return totalPrice;
    }
}
public class Pizzas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basePrice = scanner.nextDouble();
        double toppingCost = scanner.nextDouble();
        int numToppings = scanner.nextInt();
      
        Pizza regularPizza = new Pizza(basePrice, toppingCost, numToppings);
        DiscountedPizza discountedPizza = new DiscountedPizza(basePrice, toppingCost, numToppings);
        double regularPrice = regularPizza.calculatePrice();
        double discountedPrice = discountedPizza.calculatePrice();
        System.out.printf("Price without discount: Rs.%.2f\n", regularPrice);
        System.out.printf("Price with discount: Rs.%.2f\n", discountedPrice);
    }
}
