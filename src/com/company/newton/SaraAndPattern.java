package com.company.newton;

public class SaraAndPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            int t = i*6;
            for (int j = 0; j < n; j++) {
                int k = j*4;
                System.out.print((k+t) + " ");
            }
            System.out.println();
        }
    }
}
