package Ifelse;
import java.util.Scanner;
public class Two_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sb.nextInt();
        if (n < 0 ) {
             n = -n;

        }
        System.out.println(n);
    }

}
