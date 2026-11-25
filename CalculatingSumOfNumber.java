import java.util.Scanner;
public class CalculatingSumOfNumber {
    public static int sumDigits(int number){

        int sum =0;
        while (number != 0){
            sum += number %10;
            number/=10;
        }
        return sum;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four number: ");
        int number = scanner.nextInt();


        System.out.println("The sum of the numbers is: "+ CalculatingSumOfNumber.sumDigits(number));

    }
}
