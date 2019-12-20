package tp_note_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Program for converting seconds into formated H:M:S");
        Scanner sc= new Scanner(System.in);
        System.out.printf("Input number of seconds: ");
        int s=Integer.parseInt(sc.nextLine());
        int h= s/3600;
        int mn=((s%3600))/60;
        int se=(s%3600)%60;
        System.out.println("Time corresponding to 1259seconds is "+h+":"+mn+":"+se);
    }
}
