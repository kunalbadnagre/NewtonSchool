package com.company.newton;
import java.util.*;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        //for input of an array of size-1 array
        for(int i=0; i<n-1; i++ ){
            arr[i] = sc.nextInt();
        }
        //addion of all numbers from 1 to n
        int sumOfAll = (n*(n+1))/2;

        //sum of all present in the array
        int sumOfArr = 0;
        for(int i= 0; i<n-1;i++){
            sumOfArr = sumOfArr + arr[i];
        }

        int missingNum = sumOfAll - sumOfArr;
        System.out.println(missingNum);

    }
}
