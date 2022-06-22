package com.codedifferentlty.regex.practice.part02.playrewriter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PlayReWriterTest {
    private PlayReWriter playReWriter;
    String input;

    @BeforeEach
    public void setUp(){
        input = "./files/HamletEx.txt";
        playReWriter = new PlayReWriter();
    }

    @Test
    public void characterNameChangerTest01() throws IOException {
        //could also do this by checking for int of replaced words?
        String regex = "\\bHORATIO\\b|\\bHoratio\\b";
        String charName = "FlavaFlav";
        String expected = "The Tragedy of Hamlet, Prince of Denmark\n" +
                "Shakespeare homepage | Hamlet | Entire play\nACT I\n" +
                "SCENE I. Elsinore. A platform before the castle.\n" +
                "Enter FlavaFlav and MARCELLUS\nFlavaFlav";
        String actual = playReWriter.characterNameChanger(regex,charName, input);
        Assertions.assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    public void locationNameChangerTest01() throws IOException {
        String regex = "\\bDenmark\\b";
        String charName = "Wilmington";
        String expected = "The Tragedy of Hamlet, Prince of Wilmington\n" +
                "Shakespeare homepage | Hamlet | Entire play\nACT I\n" +
                "SCENE I. Elsinore. A platform before the castle.\n" +
                "Enter HORATIO and MARCELLUS\nHORATIO";
        String actual = playReWriter.locationNameChanger(regex,charName, input);
        Assertions.assertEquals(expected,actual);
        System.out.println(actual);
    }
}
