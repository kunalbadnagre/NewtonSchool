package com.harry;
import java.sql.SQLOutput;
import java.util.*;

public class Cwh_18_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to be adult!");
            case 26 -> System.out.println("You are going to get a job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjou your life!");
        }
        System.out.println("Thanks for using my Java code!");
    }
}
