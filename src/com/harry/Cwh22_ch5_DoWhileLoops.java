package com.harry;
import java.util.*;

public class Cwh22_ch5_DoWhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }
        while(a<=5);

        int b = 1;
        int n = sc.nextInt();
        do{
            System.out.println(b);
            b++;
        }while(b<=n);


    }
}
