package Calculator;
import  java.util.Scanner;

public class SimpleCalculatorIfElse {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input the operator (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Variable to store the result
        double result = 0;

        // Perform the operation based on the user input using if-else
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Handle division by zero case
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                return;
            }
        } else {
            // If an invalid operator is entered
            System.out.println("Invalid operator! Please enter +, -, *, or /.");
            return;
        }

        // Output the result
        System.out.println("The result is: " + result);
    }
}
