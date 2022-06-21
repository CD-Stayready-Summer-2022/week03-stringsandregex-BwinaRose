package com.codedifferentlty.regex.practice.part00;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Result {
    //logic
    // create variable (input string repeated infinitely)
    // loop through n characters
    // return count # of a
    public long repeatedString(String s, long n) {
        long count = 0;
        for (int a = 0; a < s.length(); a++) {
            if (s.charAt(a) == 'a') {
                count++;
            }
        }
        count = count * n / s.length();
        for (int a = 0; a < n % s.length(); a++) {
            if (s.charAt(a) == 'a') {
                count++;
            }
        }
        return count;
    }
}
