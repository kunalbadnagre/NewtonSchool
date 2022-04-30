package com.harry.PracticeSet;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 43, 345};
        boolean isSorted = true;
        for(int i= 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
