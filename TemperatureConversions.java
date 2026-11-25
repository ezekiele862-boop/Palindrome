import java.util.Scanner;
public class TemperatureConversions {
    public static double Kelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }
    public static double Celsius(double kelvin){
        double celsius = kelvin -273.15;
        return celsius;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter kelvin value: ");
        double kelvin = scanner.nextDouble();
        System.out.println("The value of celsius is: " + TemperatureConversions.Celsius(kelvin));

        System.out.println("Enter celsius value: ");
        double celsius = scanner.nextDouble();
        System.out.println("the value of kelvin is : " + TemperatureConversions.Kelvin(celsius));

    }
}
