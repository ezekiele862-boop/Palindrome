import java.util.Scanner;
public class RoundingNumber {
    public static double round(double x){
        return Math.floor(x + 0.5);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num: ");
        double num = scanner.nextDouble();

        System.out.println("Main num is: " + num);
        System.out.println("Rounded value is: " + round(num));
    }
}
