package Ifelse;

import java.util.Scanner;
public class Four_ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int CP = sc.nextInt();
        System.out.print("Enter SP: ");
        int SP = sc.nextInt();

        if(SP > CP){
            System.out.println("Profit is: " + (SP - CP));
        }
        else if(SP == CP){
            System.out.println("Equal");
        } else {
            System.out.println("Loss is:" + (CP - SP));
        }
    }
}
