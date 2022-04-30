package com.harry.PracticeSet;
import java.util.*;

public class Ps_Ch_4_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(a.endsWith(".org")){
            System.out.println("This is an organizational website.");
        }
        else if(a.endsWith(".com")){
            System.out.println("This is a commercial website.");
        }
        else if(a.endsWith(".in")){
            System.out.println("This is an Indian website.");
        }
        else{
            System.out.println("This is not an authorised website");
        }
    }
}
