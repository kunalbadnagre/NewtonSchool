package com.harry;

public class Cwh_10_ch2_DataTypes {
    public static void main(String[] args) {
        //resulting data types
//        int a = 654 + 6;

        // Increment and Decrement Operators
        int i=56;
        System.out.println(i++);//first print i then increment is happening in the i
        System.out.println(i);  //incremented value printed through this
        System.out.println(++i);//first increment is happening and then print i

        int y = 7;
        int x = ++y*8;
        System.out.println(x);

        int c = 7;
        int d = c++*8;
        System.out.println(d);

        //character increment
        char ch = 'a';
        System.out.println(++ch);
    }
}
