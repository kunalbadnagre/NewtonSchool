package com.company.newton;
import java.util.*;

public class ArrayMax1st2nd3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            t--;

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max1 = arr[0];
            int max2 = arr[0];
            int max3 = arr[0];
            int zero = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max1) {
                    max1 = arr[i];
                    zero = i;
                }
            }
            arr[zero] = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max2) {
                    max2 = arr[i];
                    zero = i;
                }
            }
            arr[zero] = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max3) {
                    max3 = arr[i];
//                zero = i;
                }
            }
            System.out.println(max1 + " " + max2 + " " + max3);
        }
    }
}