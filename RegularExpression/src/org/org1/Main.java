package org.org1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------[1]--------------------");
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println("String matches the given Regex - " + matcher.matches());
        System.out.println("--------------[2]--------------------");
        System.out.println(Pattern.matches("[xyz]","wbcd"));
        System.out.println(Pattern.matches("[xyz]","x"));
        System.out.println(Pattern.matches("[xyz]","xxyyyyz"));
        System.out.println(Pattern.matches("[xyz]","xyz"));
        System.out.println("--------------[?]--------------------");
        //X? -> X occurs once or not at all.
        System.out.println(Pattern.matches("[abc]?",""));
        System.out.println(Pattern.matches("[abc]?","a"));
        System.out.println(Pattern.matches("[abc]?","b"));
        System.out.println(Pattern.matches("[abc]?","aaa"));
        System.out.println(Pattern.matches("[abc]?","ayyyyzz"));
        System.out.println(Pattern.matches("[abc]?","amnta"));
        System.out.println(Pattern.matches("[abc]?","abc"));
        System.out.println("--------------[+]--------------------");
        //X+ -> X occurs more than one times.
        System.out.println(Pattern.matches("[abc]+","a"));
        System.out.println(Pattern.matches("[abc]+","aaa"));
        System.out.println(Pattern.matches("[abc]+","aabbbcc"));
        System.out.println(Pattern.matches("[abc]+","aammta"));
        System.out.println("--------------[*]--------------------");
        //X* -> X occurs zero or more times.
        System.out.println(Pattern.matches("[ayz]+","ayyyza"));

    }
}