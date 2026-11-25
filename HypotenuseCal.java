import java.util.Scanner;
public class HypotenuseCal {
    public static double hypotenuse(double side1, double side2){
       double h = Math.hypot(side1,side2);
       return h;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of side1: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter value of side2: ");
        double side2 = scanner.nextDouble();

        System.out.println("hypotenuse is: " + HypotenuseCal.hypotenuse(side1,side2));
    }
}
