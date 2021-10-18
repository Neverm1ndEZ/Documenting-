package com.company;
import java.util.Scanner;
public class percentage_calc {
    public static void main(String[] args) {
        float percentage, obtained, total;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter obtained marks in first subject");
        float obt1=sc.nextFloat();
        System.out.println("Enter obtained marks in second subject");
        float obt2=sc.nextFloat();
        System.out.println("Enter obtained marks in third subject");
        float obt3=sc.nextFloat();
        System.out.println("Enter obtained marks in fourth subject");
        float obt4=sc.nextFloat();
        System.out.println("Enter obtained marks in fifth subject");
        float obt5=sc.nextFloat();
        obtained = obt1+obt2+obt3+obt4+obt5;
        System.out.println("Enter total marks");
        total=sc.nextFloat();
        percentage = (obtained / total) * 100;
        System.out.print("Your percentage is: ");
        System.out.println(percentage);
    }
}
