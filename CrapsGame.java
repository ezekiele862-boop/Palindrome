import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status{CONTINUE, WON, LOST};

    private static final int SNAKE_EYES=2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    static void main() {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("point is: "+ myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice=rollDice();

            if(sumOfDice==myPoint){
                gameStatus=Status.WON;
            }
            else {
                if(sumOfDice==SEVEN){
                    gameStatus=Status.LOST;
                }
            }
        }
        if(gameStatus == Status.WON){
            System.out.println("player wins");
        }
        else {
            System.out.println("Player loses");
        }
    }
    public static int rollDice(){
        int diel1 = 1 + randomNumbers.nextInt(6);
        int diel2 = 1 + randomNumbers.nextInt(6);

        int sum = diel1 + diel2;
        System.out.println("player rolled: "+ diel1 + "+" + diel2 + "=" + sum);

        return sum;
    }
}
