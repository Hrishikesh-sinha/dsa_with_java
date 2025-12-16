package Basic_In_Java;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println("Area is: ");
        System.out.println(a);
    }
}
