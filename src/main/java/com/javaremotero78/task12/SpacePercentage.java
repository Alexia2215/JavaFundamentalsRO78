package com.javaremotero78.task12;

/*
        Write an application that reads a text from the user (type String) and counts a percentage
    of occurrences of a space character.
    - textul poate fi un caracter, un cuvant, o propozitie, o fraza sau orice peste aceste limite
    - String = asemeni tipurilor de date primitive, instantiaza variabile
    in timp ce tipurile de date dinamice/wrapper instantiaza obiecte(Integer, Double, Float, Long, StringBuffer, String Builder, etc)

    Input:
    Ana are mere si pere si coacaze

    6 spatii
    31 caractere
    6/31*100= ?%

 */

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SpacePercentage {
    public static void main(String[] args) {
        int n = 2; // variabila
        Integer m = 2;  // obiect

        // Object = este o clasa obiect de tipul entitate care se comporta ca o super clasa pt toate clasele de obiect
        // clasa de obiect Catel - mosteneste toate atributele si metodele din Object( hashAndEquals(), toString(), conslatetructors template, equals(), etc

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un text: ");
        String input = scanner.nextLine();
        /**
         *  Scanner.next() = citeste un string pana la intalnirea primului caracter alb de orice fel
         *  Scanner.nextLine() = citeste un string pana la intalnirea primului caracter alb de tipul NEW LINE (enter)
         *  caracter alb = space, enter, etc
         */

        if(input.isEmpty()) {
            System.out.println("Textul este empty. Procentajul space-urilor este: 0%");
            return;
        }

        System.out.println("Procentajul space-urilor este: " + calculateSpacePercentage(input));
    }

    private static double calculateSpacePercentage(String input) {
        int contor = 0;

        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) == ' ') {
                contor++;
            }

        }

        //cea mai optima rezolvare a problemelor de frecvente si numarare de aparitii este cea cu MAP -> HASHMAP/TREEMAP
        // todo: exercitiu freq map

        return (double) contor / input.length() * 100;
    }
}
