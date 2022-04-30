package com.harry.PracticeSet;
import java.util.*;

public class FindMaxElementInArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] marks = new int[size];

        for(int i=0; i<size; i++ ){
            marks [i] = sc.nextInt();
        }

        int max = 0;
/*
        for(int i = 0;i<size;i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
*/

        for(int e: marks){
            if(e>max)
                max = e;

        }
        System.out.println(max);
    }
}
