import java.security.SecureRandom;
import java.util.Scanner;
public class Coin {
    public enum CoinConstant {HEAD, TAILS}

    public static CoinConstant Flip (){
        SecureRandom randomNumber = new SecureRandom();
        int flip = 1 + randomNumber.nextInt(2);
        if (flip ==1){
            return CoinConstant.HEAD;
        }
        else {
            return CoinConstant.TAILS;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int heads = 0;
        int tails = 0;


        while (true){
            System.out.println("1: toss coin");
            System.out.println("2: show result");
            System.out.println("3: to exit");

            System.out.println("Enter choice");
            int choice = scanner.nextInt();
            if(choice==1){
                CoinConstant result = Flip();
                System.out.println(result);
                if(result.equals(CoinConstant.HEAD)){
                    heads++;
                }
                else {
                    tails++;
                }

            }
            if(choice==2){
                System.out.println("Amount of heads is: " + heads);
                System.out.println("Amount of tails is: " + tails);

            }
            if(choice==3){
                break;
            }

        }

    }


}
