package com.harry.PracticeSet;
import java.util.Scanner;

public class Ps_set5_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        for(int i=a; i>0; i--){
//            for(int j=0; j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();

        //practice prblm 2: sum of first n even numbers.
/*
        int sum=0;
        for(int i=0;i<=a;i++){
            sum = sum+ (2*i);
        }
        System.out.println(sum);


        //3. table of a number
        for(int i=1;i<=10;i++){
//            System.out.println(a*i);
            System.out.printf("%d X %d = %d \n", a, i, a*i);

        //Practice prblm 6: find factorial of input
        int i=1;
        int factorial = 1;
        while(i<=a){
            factorial *= i;
            i++;

        }
        System.out.println(factorial);
*/
        //prblm number 9: sum of table of 8
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum = sum + i*a;
        }
        System.out.println(sum);
    }
}
