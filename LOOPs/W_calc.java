package LOOPS;

import java.util.Scanner;

public class W_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n===== Basic Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                // Input two numbers
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                // Perform the selected operation
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error! Division by zero is not allowed.");
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 5);

        sc.close();
    }
}
