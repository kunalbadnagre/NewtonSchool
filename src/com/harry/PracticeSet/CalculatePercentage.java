package com.harry.PracticeSet;
import java.util.*;


public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a+ b+ c+ d+ e;

        int outOf = sc.nextInt();

        int percentage = (sum*100)/(5*outOf);
        System.out.println(percentage+"%");
    }
}
