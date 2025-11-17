package repetition;

import java.util.Scanner;

public class WhileInderteminated {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String command = "";

        while(!command.equals("exit")) {
            System.out.println("Enter a command: ");
            command = keyboard.nextLine();
            System.out.println("Command: " + command);
        }

        System.out.println("Exiting...");
        keyboard.close();
    }
}
