package Basic_In_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle Ammout: ");
        double Principle = sc.nextDouble();
        System.out.print("Enter the Time Period: ");
        double Time = sc.nextDouble();
        System.out.print("Enter the Rate: ");
        double Rate = sc.nextDouble();

        double si = Principle * Rate * Time / 100;


        System.out.print("The Simple Interest is: ");
        System.out.print(si);

    }
}
