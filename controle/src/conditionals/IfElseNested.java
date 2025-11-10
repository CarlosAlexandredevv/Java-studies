package conditionals;

import java.util.Scanner;

public class IfElseNested {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the student's grade: ");
        Double grade = keyboard.nextDouble();

        boolean validGrade = grade > 10 || grade < 0;
        boolean approved = grade >= 7;
        boolean recovery = grade >= 5 && grade < 7;
        boolean failed = grade < 5;

        if(validGrade) {
            System.out.println("Invalid grade");
        } else if(approved) {
            System.out.println("The student is approved");
        } else if(recovery) {
            System.out.println("The student is in recovery");
        } else if(failed) {
            System.out.println("The student is not approved");
        }

        keyboard.close();        
    }
}
