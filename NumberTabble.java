public class NumberTabble {
    static void main() {
        System.out.println("Decimal"+ "\t"+"Binary"+ "\t" + "Octal" + "\t"+ "Hexadecimal");

        for (int number =1; number<= 256; number++){
            System.out.println(number + "\t" + Integer.toBinaryString(number) + "\t" + Integer.toOctalString(number)+"\t" + Integer.toHexString(number));
        }
    }
}
