package Ifelse;
import java.util.Scanner;
public class Five_divisibleby3or5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();
        if(n%5 == 0 || n%3 == 0){
            System.out.println("Number is divisible by five and three");

        } else {
            System.out.println("Number is Not divisible by five and three");
        }
    }
}
