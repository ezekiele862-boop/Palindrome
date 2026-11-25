import java.util.Scanner;
public class Rounding {
    public static double roundToInteger(double number){
        double y = Math.floor(number + 0.5);
        return y;
    }
    public static double roundToTenths(double number){
        double y = Math.floor(number * 10 + 0.5) / 10;
        return y;
    }
    public static double roundToHundreds(double number){
        double y = Math.floor(number * 100 + 0.5) / 100;
        return y;
    }
    public static double roundToThousands(double number){
        double y = Math.floor(number * 1000 + 0.5) / 1000;
        return y;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        double number = scanner.nextDouble();

        System.out.println("Original number: "+ number);
        System.out.println("Integer: " + Rounding.roundToInteger(number));
        System.out.println("Tenths: "+ Rounding.roundToTenths(number));
        System.out.println("Hundred: "+ Rounding.roundToHundreds(number));
        System.out.println("Thousand: "+ Rounding.roundToThousands(number));
    }
}
