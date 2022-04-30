package com.harry.PracticeSet;

public class ReverseAnArray {
    public static void main(String[] args){
        int []arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        // swap a[i] and a[l-1-i]
        for(int i=0; i<n; i++ ){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
