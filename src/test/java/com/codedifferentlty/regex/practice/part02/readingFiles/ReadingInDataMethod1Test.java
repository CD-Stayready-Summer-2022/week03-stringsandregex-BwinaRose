package com.codedifferentlty.regex.practice.part02.readingFiles;

import com.codedifferentlty.regex.practice.part01.replacing.RegexReplaceWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ReadingInDataMethod1Test {
    private ReadingInDataMethod01 readMethod01;

    @BeforeEach
    public void setUp(){ readMethod01 = new ReadingInDataMethod01();}

    @Test
    public void readAndReplaceDataTest01() throws IOException {
        String REGEX = "\\balways\\b";
        String pathToFile = "./files/Sample1.txt";
        String replace = "never";
        String expected = "Code Differently\nOur Students never forget to write their unit test.";
        String actual = readMethod01.readDataInAndReplace(pathToFile, REGEX, replace);
        Assertions.assertEquals(expected,actual);
    }
}
