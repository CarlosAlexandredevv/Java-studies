package repetition;

import java.util.Scanner;

public class ChallengerOperationMath {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("-------------");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("-------------");
        System.out.println("Input the operation: ");
        String operation = keyboard.nextLine();
        System.out.println("Input the first number: ");
        double number1 = keyboard.nextDouble();
        System.out.println("Input the second number: ");
        double number2 = keyboard.nextDouble();

        switch(operation){
            case "1":
                System.out.println("Result: " + (number1 + number2));
                break;
            case "2":
                System.out.println("Result: " + (number1 - number2));
                break;
            case "3":
                System.out.println("Result: " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        keyboard.close();
    }
}
