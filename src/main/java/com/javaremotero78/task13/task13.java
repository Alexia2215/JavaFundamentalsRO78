package com.javaremotero78.task13;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti un text: ");
        String input = sc.nextLine();

        //Split original string to an arrays of strings
        String[] wordsArray = input.split( " ");
        List<String> wordsList = new ArrayList<>(List.of(wordsArray));

        StringBuilder stutteredText = new StringBuilder();
        for(String it: wordsList) {
            stutteredText
                    .append(it)
                    .append(" ")
                    .append(it)
                    .append(" ");
        }
    }
}
