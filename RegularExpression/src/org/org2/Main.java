package org.org2;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------[d]---------------------");
        System.out.println(Pattern.matches("d","abc"));
        System.out.println(Pattern.matches("d","1"));
        System.out.println(Pattern.matches("d","4433"));
        System.out.println(Pattern.matches("d","323abc"));
        System.out.println("-------------------[D]---------------------");
        System.out.println(Pattern.matches("D","abc"));
        System.out.println(Pattern.matches("D","1"));
        System.out.println(Pattern.matches("D","4433"));
        System.out.println(Pattern.matches("D","323abc"));
        System.out.println(Pattern.matches("D*",""));
        System.out.println(Pattern.matches("D*","abc"));        //???
    }
}
