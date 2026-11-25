import java.util.Scanner;
public class DistanceBetweenPoints {
    public static double distance (double x1, double x2, double y1, double y2){
        double z = Math.sqrt((Math.pow(x1 - y1,2) + Math.pow(x2 - y1,2)));
        return z;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of x1: ");
        double x1 = scanner.nextDouble();

        System.out.println("Enter value of x2: ");
        double x2 = scanner.nextDouble();

        System.out.println("Enter value of y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter value of y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("The distance between points is: " + DistanceBetweenPoints.distance(x1,x2,y1,y2));
    }
}
