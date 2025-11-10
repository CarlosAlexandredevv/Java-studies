package conditionals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input a number: ");
        Integer number = keyboard.nextInt();

        if(number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        keyboard.close();
     }
}
