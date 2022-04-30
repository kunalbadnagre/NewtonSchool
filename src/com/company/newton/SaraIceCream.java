package com.company.newton;
import java.util.*;
public class SaraIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int F =0;

        for(int i=0; i<D;i++){
            F = (N-(N/2))*3;
            N= F;
        }
        System.out.println(N);

    }
}
