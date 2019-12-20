package tp_note_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.printf("Program for calculating cost of a call.\n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please input start hours: ");
        int sh=Integer.parseInt(sc.nextLine());
        System.out.printf("Please input start minutes: ");
        int sm=Integer.parseInt(sc.nextLine());
        System.out.printf("Please input start seconds: ");
        int sse=Integer.parseInt(sc.nextLine());

        System.out.printf("Please input end hours: ");
        int eh=Integer.parseInt(sc.nextLine());
        System.out.printf("Please input end minutes: ");
        int em=Integer.parseInt(sc.nextLine());
        System.out.printf("Please input end seconds: ");
        int ese=Integer.parseInt(sc.nextLine());

        int ts1=sh*3600+sm*60+sse;
        int ts2=eh*3600+em*60+ese;
        int ts=ts2-ts1;

        int th= ts/3600;
        int tm=((ts%3600))/60;
        int tse=(ts%3600)%60;


        double tc=((double) ts/60) *0.05;

        System.out.println("\n-------------------------------------------------");
        System.out.println("Total call duration: " +th+"h "+tm+"mn "+tse+"s" );
        System.out.println("Total cost of this call: "+tc+"$");

    }
}
