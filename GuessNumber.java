import java.util.Scanner;
import java.security.SecureRandom;
public class GuessNumber {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

        boolean playAgain = true;
        while (playAgain){
            int secretNumber = 1 + randomNumber.nextInt(1000);

            System.out.println("Guess a number between 1 to 1000");
            int guess=0;

            while (guess != secretNumber){
                System.out.println("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess > secretNumber){
                    System.out.println("Too high. try again");
                } else if (guess < secretNumber) {
                    System.out.println("Too low. try again");
                }
                else {
                    System.out.println("Congratulation. you guessed correctly");
                }
            }
            System.out.println("play again: 1= yes and 2 = no");
            playAgain = scanner.nextInt() == 1;
        }

    }
}
