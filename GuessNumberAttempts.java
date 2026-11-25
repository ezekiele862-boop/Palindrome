import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberAttempts {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        SecureRandom randomNumber = new SecureRandom();

        boolean playAgain = true;
        while (playAgain) {
            int secretNumber = 1 + randomNumber.nextInt(1000);

            System.out.println("Guess a number between 1 to 1000");
            int guess = 0;
            int attempts = 0;

            while (guess != secretNumber) {
                System.out.println("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too high. try again");
                } else if (guess < secretNumber) {
                    System.out.println("Too low. try again");
                } else {
                    System.out.println("Congratulation. you guessed correctly");
                }
            }
            if (attempts < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else if (attempts == 10) {
                System.out.println("Aha! You know the secret!");
            } else {
                System.out.println("You should be able to do better!");
            }
            System.out.println("play again: 1= yes and 2 = no");
            playAgain = scanner.nextInt() == 1;
        }
    }
}
