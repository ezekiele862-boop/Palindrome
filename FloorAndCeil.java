import java.util.Scanner;
public class FloorAndCeil {
    public static int myFloor(double x){
        int floor = (int) x;
        return floor;
    }
    public static int myCeil(double x){
        int ceil = (int) x;
        if( x == ceil){
            return ceil;
        }
        else {
            int y = (int) x;
            return y + 1;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        double x = scanner.nextDouble();

        System.out.println("value of x for floor is: " + myFloor(x));
        System.out.println("value of X for ceil is: " + myCeil(x));
    }
}
