import java.util.Scanner;
public class GCD {
    public static int gcd(int a, int b){
        while (b != 0){
            int reminder = a % b;
            a=b;
            b = reminder;
        }
        return a;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.println("the gcd value is: " + gcd (a,b));

    }
}
