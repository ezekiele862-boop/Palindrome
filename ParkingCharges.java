import java.util.Scanner;
public class ParkingCharges {
    public  static double calculateCharges(double hour){
        double charge = 2.0;
        double amount= 0.00;
        if (hour > 3){
            amount +=(hour-3)*0.50;
            return amount;

        }
        return charge;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Enter number of customer: ");
        int customer = scanner.nextInt();

        for (int i = 1; i <= customer; i++){
            System.out.println("Enter number of Hours: ");
            double hours = scanner.nextDouble();

            double charge = calculateCharges(hours);

            System.out.println("Charge is: "+ charge);
            total = total+charge;
        }
        System.out.println("Total charge of all customer receipts : " + total);
    }
}
