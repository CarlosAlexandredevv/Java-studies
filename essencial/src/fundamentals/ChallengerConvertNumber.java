import java.util.Scanner;

public class ChallengerConvertNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input first salary");
        String value1 = keyboard.nextLine().replace(',', '.');
        double salary1 = Double.parseDouble(value1);

        System.out.println("Input second salary");
        String value2 = keyboard.nextLine().replace(',', '.');
        double salary2 = Double.parseDouble(value2);

        System.out.println("Input thyrd salary");
        String value3= keyboard.nextLine().replace(',', '.');
        double salary3= Double.parseDouble(value3);

        System.out.printf("%.2f %.2f %.2f %n", salary1,salary2,salary3);

        double total = salary1 + salary2 + salary3;

        double average = total / 3;

        System.out.printf("Average salary is: %.2f%n", average);

        keyboard.close();

    }
}
