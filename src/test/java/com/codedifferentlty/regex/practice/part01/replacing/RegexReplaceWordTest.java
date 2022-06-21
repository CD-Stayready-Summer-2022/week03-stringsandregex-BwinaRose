package com.codedifferentlty.regex.practice.part01.replacing;

import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegexReplaceWordTest {

//    replacing one word
//    replacing multiple
//    replacing prefix words that start with a prefix

    private RegexReplaceWord replaceWord;

    @BeforeEach
    public void setUp(){ replaceWord = new RegexReplaceWord();}

    @Test
    public void replaceOneWordTest01(){
        String REGEX = "\\bduck\\b";
        String input = "You are like a duck out of water.";
        String replace = "fish";
        String expected = "You are like a fish out of water.";
        String actual = replaceWord.replaceFirst(REGEX, replace, input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void replaceAllWordsTest01(){
        String REGEX = "\\bduck\\b";
        String input = "Today I bought a duck. She wanted a pet platypus but ended " +
                "up getting a duck instead. She is like a duck out of water.";
        String replace = "fish";
        String expected = "Today I bought a fish. She wanted a pet platypus but ended " +
        "up getting a fish instead. She is like a fish out of water.";
        String actual = replaceWord.replaceAll(REGEX, replace, input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void replaceAllPrefixWordsTest01(){
        String REGEX = "\\bun";
        String input = "remix undo injustice into impossible unfriendly " +
                "antihero unhand bicycle unable uncommon";
        String replace = "";
        String expected = "remix do injustice into impossible friendly " +
                "antihero hand bicycle able common";
        String actual = replaceWord.replaceAll(REGEX, replace, input);
        Assertions.assertEquals(expected,actual);
    }

//    @Test
//    public void replaceNthWordTest01(){
//        Integer n = 1;
//        String REGEX = "\\bduck\\b";
//        String input = "Today I bought a duck. She wanted a pet platypus but ended up getting a duck instead. She is like a duck out of water.";
//        String replace = "fish";
//        String expected = "Today I bought a fish. She wanted a pet platypus but ended up getting a duck instead. She is like a duck out of water.";
//        String actual = replaceWord.replaceNthWord(REGEX, replace, n,input);
//        Assertions.assertEquals(expected,actual);
//    }


}
