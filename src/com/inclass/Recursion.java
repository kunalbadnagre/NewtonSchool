package com.inclass;
import java.util.*;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        int ans=fact(n);
        if(ans==-1)
        {
            System.out.println("Invalid input");
        }
        else {
            System.out.println(ans);
        }
    }


    public static int fact(int n){// we will get input >=0

        if(n<0){
            return -1;
        }

        if(n==0 || n==1) {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}