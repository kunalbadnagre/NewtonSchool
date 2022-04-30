package com.harry.PracticeSet;
import java.util.*;

public class Ps_Ch_4_PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float D = (a+b+c)/3.0f;

        if(a>=33 && b>=33 && c>=33 && D>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
