import java.util.Scanner;
public class Divisible {
    public static boolean isDivisible (int number){

        if (number % 5 ==0){
            return true;
        }
        else {
            return false;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        for (int i =1; i <= 10; i++){
            System.out.println("Enter number: ");
            int number = scanner.nextInt();

            boolean value = isDivisible(number);
            System.out.println("print value "+ value);

            System.out.println(isDivisible(number));
        }
    }
}
