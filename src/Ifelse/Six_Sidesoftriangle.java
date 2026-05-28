package Ifelse;
import java.util.Scanner;

public class Six_Sidesoftriangle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int a = sb.nextInt();
        System.out.print("Enter 2nd Side: ");
        int b = sb.nextInt();
        System.out.print("Enter 3rd Side: ");
        int c = sb.nextInt();

        if(b+c>a && a+c>b && a+b>c ){
            System.out.println("These Numbers are sides of  Triangle");
        } else{
            System.out.println("These Numbers are not sides of Triangle");
        }
    }
}
