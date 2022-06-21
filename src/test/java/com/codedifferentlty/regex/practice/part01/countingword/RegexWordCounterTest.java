package com.codedifferentlty.regex.practice.part01.countingword;

//Create unit test for the following scenerios:
//finding one word
//finding multiple words
//finding words that start with a prefix

import com.codedifferentlty.regex.practice.part00.Result;
import com.codedifferentlty.regex.practice.part01.countingwords.RegexWordCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegexWordCounterTest {
    private RegexWordCounter wordCounter;

    @BeforeEach
    public void setUp(){ wordCounter = new RegexWordCounter();}

    @Test
    public void oneWordTest01(){
        String REGEX = "\\bcat\\b";
        String input = "cat rat pat mat lat sat hat";
        Integer expected = 1;
        Integer actual = RegexWordCounter.countWordOccurrences(REGEX, input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleWordTest01(){
        String REGEX = "at\\b";
        String input = "cat rat pat cot mat lat sat sit hat cut chet chat mast frat";
        Integer expected = 9;
        Integer actual = RegexWordCounter.countWordOccurrences(REGEX, input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void prefixWordTest01(){
        String REGEX = "\\bnon";
        String input = "bicycle disagree bilingual bisect extraordinary nonsense embrace nonentity nondescript";
        Integer expected = 3;
        Integer actual = RegexWordCounter.countWordOccurrences(REGEX, input);
        Assertions.assertEquals(expected,actual);
    }
}
