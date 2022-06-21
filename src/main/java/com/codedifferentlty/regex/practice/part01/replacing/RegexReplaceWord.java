package com.codedifferentlty.regex.practice.part01.replacing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplaceWord {

    public static String replaceFirst(String regex, String replace, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceFirst(replace);
    }

    public static String replaceAll(String regex, String replace, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.replaceAll(replace);
    }

    //a integer reprecented the nth occurence of that word to replace

    public static String replaceNthWord(String regex, String replace,Integer n, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        String temp = "";
        while (m.find(n)){
            temp = m.replaceFirst(replace);
        }
        return temp;
    }

}