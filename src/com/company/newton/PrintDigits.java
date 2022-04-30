package com.company.newton;
import java.util.*;

public class PrintDigits {
    public static void main(String[] args) {
        int N = 1024;
        String M = String.valueOf(N);
        int length = M.length();
        for(int i=0; i<M.length();i++){
            char digit = M.charAt(i);
            switch(digit) {
                case '0' -> System.out.print("zero ");
                case '1' -> System.out.print("one ");
                case '2' -> System.out.print("two ");
                case '3' -> System.out.print("three ");
                case '4' -> System.out.print("four ");
                case '5' -> System.out.print("five ");
                case '6' -> System.out.print("six ");
                case '7' -> System.out.print("seven ");
                case '8' -> System.out.print("eight ");
                case '9' -> System.out.print("nine ");

            }
        }
    }
}
