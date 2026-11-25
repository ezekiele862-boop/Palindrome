import java.util.Scanner;
public class PalindromeNumber {
    public static boolean isPalindrome(int number){
        int original = number;
        int reverse = 0;
        while (number !=0 ){
            int digit = number %10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        if (original== reverse){
            System.out.println("it is a palindrome");
            return true;
        }
        else {
            System.out.println("it is not a palindrome");
            return false;
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println(isPalindrome(number));
    }
}
