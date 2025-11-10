package conditionals;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Report the student's final average: ");
        Double average = Double.parseDouble(keyboard.nextLine().replace(',', '.'));

        if(average <= 10 && average >= 7) {
            System.out.println("The student is approved");
        }

        if( average < 7 && average >= 4.5) {
            System.out.println("The student is in recovery");
        }

        if(average < 4.5 && average >= 0) {
            System.out.println("The student is not approved");
        }
       
        System.out.println("The Average final is: " + average);

        keyboard.close();
    }
}
