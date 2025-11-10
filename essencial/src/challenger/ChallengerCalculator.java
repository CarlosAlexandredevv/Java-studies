import java.util.Scanner;

public class ChallengerCalculator {
    public static void main(String[] args) {
        calculator();
    }

    static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        Double number1 = scanner.nextDouble();

        System.out.print("Input second number: ");
        Double number2 = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Input operation (+, -, *, /, %): ");
        String operation = scanner.nextLine();

        scanner.close();

        Double result;

        switch (operation) {
            case "+":
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                }
                result = number1 / number2;
                System.out.println("Result: " + result);
                break;
            case "%":
                if (number2 == 0) {
                    System.out.println("Modulo by zero is not allowed.");
                } else {
                    result = number1 % number2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Operation not supported.");
                break;
        }
    }
}

