import java.util.Scanner;
public class DisplayingSquareCharacter {
    public static int squareOfCharacter(int side,char fillCharacter ){
        for (int row = 1; row <= side; row++) {
            for (int column = 1; column <= side; column++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
        return side;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ");
    }
}
