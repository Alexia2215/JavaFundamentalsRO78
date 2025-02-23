package com.javaremotero78.task11;

/*
    Write an application that will read texts (variables of the String type) until the user gives
    the text "Enough!" and then writes the longest of the given texts (not including the text
    "Enough!"). If the user does not provide any text, write "No text provided".
 */

import java.util.Objects;
import java.util.Scanner;

public class task11 {
    public static final String stop = "Enough!";
    public static void main(String[] args) {
        String stop = "Enough!"; // constanta

        Scanner scanner = new Scanner(System.in);

        System.out.println("textele sunt: ");
        String urm=scanner.next();

        String pre="";
        while(!Objects.equals(urm,stop)) {
            if(pre.length()<urm.length()) {
                pre = urm;
            }

            urm = scanner.next();

        }
        if(!pre.isEmpty())
            System.out.println("cuvantul este: " + pre);
        else
            System.out.println("Nu a fost introdus niciun cuvant!");
    }
}
