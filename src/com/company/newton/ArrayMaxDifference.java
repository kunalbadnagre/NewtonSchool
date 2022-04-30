package com.company.newton;
import java.util.*;

public class ArrayMaxDifference {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=0;
        for(int e: arr){
            if(e>max)
                max = e;
        }
        for(int e: arr){
            if(e<min)
                min = e;
        }
        System.out.println(max-min);
    }
}