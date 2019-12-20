package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.printf("Program for converting money in Riels to Dollars.\n");
        System.out.printf(" Conversion rate is: 1 USD = 4000 RIELS\n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please input money in Riels:");
        int money=Integer.parseInt(sc.nextLine());

        double exch= (double) money/4000;

        System.out.printf("\n-----------------------------------------\n");
        System.out.printf(money+" RIELS = " +exch+ " USD");


    }
}
