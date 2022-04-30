package com.harry;
import java.util.*;

public class Cwh_Ch2_operators {
    public static void main(String[] args) {
//        int a = 4;
//        int b = 6%a;
//
        int a = 9;
        a +=3;
        int c = 9;
        c -= 3;
        int b = 9;
        b *= 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Comparision operators");
        System.out.println(6==6);//comparision operators
        System.out.println(6==4);//comparision operators
        System.out.println(64>6);//comparision operators
        System.out.println(64<6);//comparision operators
        System.out.println("Logical operators");
        System.out.println(64>5 && 64>6); // logical operators
        System.out.println(64>5 && 64<6);
        System.out.println(64>5 || 64<6);
    }
}
