package com.inclass;
import java.util.*;

public class bubblesort {
    // bring smallest element at its right position in every operation
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        boolean isSwapped;
        int count=0;
// 5 2 6 3 -> n , n-1
// 2 5 3 6  -> 1 operation
        // 5 2 6 3 -> 4 [0 to 3]-> 3
        // 2 5 6 3 -> inner 1 operation
        // 2 5 6 3 -> inner 2nd operation
        // 2 5 3 6 -> inner 3rd operation
// 2 3 5 6   -> 2 operation
        // 2 5 3 [6] -> 3 [0 to 2] -> 2
        // 2 5 3 [6] -> inner 1st operation
        // 2 3 5 [6] -> inner 2nd operation
// 2 3 5 6   -> 3 operation

        for(int i=0;i<n-1;i++){  // n-1// i=0 , 1,       2
            count++;
            isSwapped=false;
            for(int j=0;j<n-i-1;j++){//  0 -  2  // 0 - 1  // 0
                if(arr[j]>arr[j+1]){
                    // we have to do swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false)
                break;
        }
        System.out.println(count);
        // 5 2 6 3
    }

    // 5 3 6 2 10 11 12 13
    // 3 5 2 6 10 11 12 13
    // 3 2 5 6 10 11 12 13
    // 2 3 5 6 10 11 12 13

    // 2 3 5 6 10 11 12 13 -> nothing left to sort
    // time comp-> operation performing per input

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// size of array //5

        int arr[]=new int[n];// declaring and instantiating

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();// arr[0] arr[1]....
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        bubbleSort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
