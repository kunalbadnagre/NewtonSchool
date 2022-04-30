package com.harry;
import java.util.*;

public class Cwh_17_RelationalAndLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a||b||c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("the value of not (a) is " + !a);
        System.out.println("the value of not (a) is " + !b);
    }
}
