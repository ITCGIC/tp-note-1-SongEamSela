package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Program for converting time to seconds.");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please input hours: ");
        int h=Integer.parseInt(sc.nextLine());
        System.out.printf("Please input minutes: ");
        int mn=Integer.parseInt(sc.nextLine());
        System.out.printf("Please input seconds: ");
        int se=Integer.parseInt(sc.nextLine());
        int s=h*3600+mn*60+se;
        System.out.println("\n----------------------------------------");
        System.out.println("Number of seconds = "+h+"*3600" +" + "+mn+"*60" + " + "+se + " = "+s);

    }
}
