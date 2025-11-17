package challengers;

import java.util.Scanner;


public class ChallengerGuess {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double secret = (int) (Math.random() * 100);

        int kick = -1;

        while(kick != secret){
            System.out.println("Guess the number: ");
            kick = keyboard.nextInt();

            if(kick < secret){
                System.out.println("The number is higher");
            } else if(kick > secret){
                System.out.println("The number is lower");
            }
        }

        System.out.println("Guess the number: " + secret);
        keyboard.close();
    }
}
