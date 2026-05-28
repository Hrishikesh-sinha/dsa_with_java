package Ifelse;
import java.util.Scanner;

public class Four_FourDigitNumber {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        if( n > 999 && n < 10000) {
            System.out.println("4 Digit Number");
        }
        else{
            System.out.println("Not a four Digit Number ");
        }
    }
}
