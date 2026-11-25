import java.util.Scanner;
public class BeautifyingStrings {
    public static String addFullStop(String text){
        if(!text.endsWith(".")){
            text += ".";
        }
        return text;
    }
    public static String capitalizerFistLetter(String text){
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
    public static String beautifyString(String text){
        text = capitalizerFistLetter(text);
        text = addFullStop(text);
        return text;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String text = scanner.next();

        System.out.println(beautifyString(text));
    }
}
