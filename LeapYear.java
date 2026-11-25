import java.util.Scanner;
public class LeapYear {
    public static boolean isLeapYear(int year){
        if ((year % 400 == 0) || (year % 4==0 && year % 100 !=0)){

            System.out.println("it is a leap year");
            return true;
        }
        else {
            System.out.println("it is not a leap year");
            return false;
        }

    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }
}
