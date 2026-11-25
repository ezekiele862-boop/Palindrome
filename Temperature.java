import java.util.Scanner;
public class Temperature {
    public static String sportsRecommender (double temperature){
        if(temperature >= 20 && temperature <= 30){
            return "it's lovely weather for sports today!";
        }
        if (temperature >= 10 && temperature <= 40){
            return "it's reasonable weather for sports today.";
        }
        return "please exercise with care today, watch out for the weather!";
    }

    static void main() {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.println(Temperature.sportsRecommender(temperature));
    }
}
