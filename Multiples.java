import java.util.Scanner;
public class Multiples {
    public static boolean isMultiples(int num1, int num2){
        if((num2) %(num1)==0){
            return true;
        }
        else {
            return false;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.println(isMultiples(num1,num2));
    }
}
