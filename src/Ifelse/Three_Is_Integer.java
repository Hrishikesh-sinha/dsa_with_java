package Ifelse;
import java.util.Scanner;

public class Three_Is_Integer {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Number: ");
        double n = sb.nextDouble();
  int x = (int)n;
  if (n-x > 0 ) {
      System.out.println("Not an Integer");
  } else{
          System.out.println("Integer");
      }
  }
    }

