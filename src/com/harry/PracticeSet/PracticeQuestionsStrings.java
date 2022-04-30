package com.harry.PracticeSet;
import java.util.*;

public class PracticeQuestionsStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.Convert a string to lower case
        String a = sc.nextLine();
        System.out.println(a.toLowerCase());

        //2.replace spaces to underscore
        System.out.println(a.replace(" ","_"));

        //3. replace <|name|> with a name
        String str = new String("Dear <|name|>, Thanks a lot");
        System.out.println(str.replace("<|name|>","Kunal"));

        //4.detect double and triple spaces in a string
        String myString = " This String contains  double and   triple spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //5.format the following letter with the help of escape sequence.
        String letter = "Dear Harry, \n\tThis Java course is nice. \n\tThanks";
        System.out.println(letter);

    }
}
