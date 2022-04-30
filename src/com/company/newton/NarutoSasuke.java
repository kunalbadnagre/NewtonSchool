package com.company.newton;
import com.sun.source.tree.ReturnTree;

import java.util.*;

public class NarutoSasuke {
    static char Race(int A, int B, int C) {
        int Naruto = Math.abs(C - A);
        int Sasuke = Math.abs(C - B);

        if (Naruto > Sasuke) {
            System.out.println('S');
        } else if (Naruto < Sasuke) {
            System.out.println('N');
        } else if (Naruto == Sasuke) {
            System.out.println('D');
        }
//        return Race;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        Race(A, B, C);

    }
}
