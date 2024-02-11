import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for two floating-point numbers
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble(); // Accepts floating-point numbers
        
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble(); // Accepts floating-point numbers


        System.out.print("Choose an operation (+, -, *, /): ");
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        }else if (operation.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("Error: Divide by Zero");
            } else {
                System.out.println("Result: " + (firstNumber / secondNumber));
            }
        } else {
            System.out.println("Invalid operation selected. Please choose +, -, *, or /.");
        }
        
    }

}