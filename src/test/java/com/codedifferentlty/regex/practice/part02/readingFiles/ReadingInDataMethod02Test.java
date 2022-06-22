package com.codedifferentlty.regex.practice.part02.readingFiles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ReadingInDataMethod02Test {
    private ReadingInDataMethod02 readMethod02;

    @BeforeEach
    public void setUp(){ readMethod02 = new ReadingInDataMethod02();}

    @Test
    public void readDataTest01() throws IOException {
        String pathToFile = "./files/Sample1.txt";
        String expected = "Code Differently\nOur Students always forget to write their unit test.\n";
        String actual = readMethod02.readDataIn(pathToFile);
        Assertions.assertEquals(expected,actual);
    }
}
