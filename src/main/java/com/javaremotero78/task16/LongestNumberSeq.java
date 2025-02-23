package com.javaremotero78.task16;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LongestNumberSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersInput = new ArrayList<>();

        System.out.print("Introduceti dimensiunea listei: ");
        int dim = sc.nextInt();
        System.out.print("Introduceti " + dim + " numere intregi: ");
        for (int i = 0; i < dim ; i++) {
            while(true) {
                try {
                    numbersInput.add(sc.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input invalid, introduceti doar valori intregi");
                    sc.next();
                }
            }

        }
        System.out.println(numbersInput);
    }
}
