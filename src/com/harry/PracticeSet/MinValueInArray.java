package com.harry.PracticeSet;

public class MinValueInArray {
    public static void main(String[] args) {
        int arr[] = {454, 23, 45643, 123, 436, 34};
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println(min);
    }
}
