package com.harry;
import java.util.*;

public class Cwh_16_ConditionalsIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean cond = (age>18);

        if(cond){
            System.out.println("Yes boy you can drive.");
        }
        else{
            System.out.println("No boy you can not drive yet!");
        }
    }
}
