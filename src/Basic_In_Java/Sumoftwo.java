package Basic_In_Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        Scanner Sum = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int x = Sum.nextInt();
        System.out.print("Enter Second Number: ");
        int y = Sum.nextInt();
        System.out.print("Enter Third Number: ");
        int z = Sum.nextInt();
        System.out.print("Sum of All three Numbers are: ");
        System.out.println( x + y + z);

    }
}
