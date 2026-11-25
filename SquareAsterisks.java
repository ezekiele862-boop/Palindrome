import java.util.Scanner;

public class SquareAsterisks {

    public static int squareOfAsterisks(int side) {
        for (int row = 1; row <= side; row++) {
            for (int column = 1; column <= side; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return side;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of side: ");
        int side = scanner.nextInt();
        System.out.println(SquareAsterisks.squareOfAsterisks(side));
    }
}




