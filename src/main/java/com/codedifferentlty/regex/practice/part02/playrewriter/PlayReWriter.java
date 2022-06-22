package com.codedifferentlty.regex.practice.part02.playrewriter;

import com.codedifferentlty.regex.practice.part02.readingFiles.ReadingInDataMethod01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayReWriter {
    public String characterNameChanger(String regex, String characterName, String input) throws IOException {
        String pathToFile = input;
        String str = ReadingInDataMethod01.readDataIn(pathToFile);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.replaceAll(characterName);
    }

    public String locationNameChanger(String regex,
                                       String locationName,
                                       String input) throws IOException {
        String pathToFile = input;
        String str = ReadingInDataMethod01.readDataIn(pathToFile);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.replaceAll(locationName);
    }
}
