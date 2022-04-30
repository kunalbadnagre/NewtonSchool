package com.harry;
import java.util.*;

public class Cwh_14_StringMethods {
    public static void main(String[] args) {
//        String a = "Kunal Badnagre";
        String name = new String("Kunal Badnagre");
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lover = name.toLowerCase();
        System.out.println(lover);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String nonTrimmedString = "          Kunal           ";
        System.out.println(nonTrimmedString);

        String trimmed = nonTrimmedString.trim();
        System.out.println(trimmed);

        System.out.println(name.substring(3));
        System.out.println(name.substring(3,8));

        System.out.println(name.startsWith("Kunal"));
        System.out.println(name.startsWith("Badnagre"));
        System.out.println(name.endsWith("Badnagre"));
        System.out.println(name.endsWith("gre"));

        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("Bad"));
        System.out.println(name.indexOf("B"));
        System.out.println(name.indexOf("a", 4));
        System.out.println(name.lastIndexOf("a"));

        String cwh = "Harry";
        System.out.println(cwh.replace('r','p'));
        System.out.println(cwh.replace("rry","ier"));

        System.out.println(name.equals("Kunal Badnagre"));
        System.out.println(name.equalsIgnoreCase("kunal BADNAGRE"));

        System.out.println("I am \n escape \b sequence \" double \t quote");
    }
}
