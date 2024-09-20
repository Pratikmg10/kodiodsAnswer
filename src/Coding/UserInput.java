package Coding;

import java.util.Scanner;

class InvalidDonatException extends Exception {
    public InvalidDonatException(String message) {
        super(message);
    }
}

public class UserInput {
    private int age;
    private double weight;

    public void getUserInput() throws InvalidDonatException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your age (between 21 and 60): ");
        age = scanner.nextInt();
        
        System.out.print("Please enter your weight (between 40 and 70): ");
        weight = scanner.nextDouble();
        
        validateInput();
    }

    private void validateInput() throws InvalidDonatException {
        if (age < 21 || age > 60) {
            throw new InvalidDonatException("Age must be between 21 and 60.");
        }
        if (weight < 40 || weight > 70) {
            throw new InvalidDonatException("Weight must be between 40 and 70.");
        }
    }

    public static void main(String[] args) {
        UserInput user = new UserInput();
        try {
            user.getUserInput();
            System.out.println("Age: " + user.age + ", Weight: " + user.weight);
        } catch (InvalidDonatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


