package org.org3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the regex pattern");
                String regexPattern = scanner.nextLine();
                Pattern pattern = Pattern.compile(regexPattern);
                Matcher matcher = pattern.matcher("Welcome to Edureka Youtube channel");
                boolean found = false;
                while (matcher.find()) {
                    System.out.println("found the text "+matcher.group() + " starting at index "+matcher.start() + " and ending at index "+matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.println("Match Not found");
                }
            }
        }
    }
}
