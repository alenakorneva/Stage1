package com.epam.automation.collections.optionalTaskCollections;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingLinesByLength {
    ArrayList<StringBuilder> poemLines = new ArrayList<>();


    public void listInitialization() {

        poemLines.add(new StringBuilder("Lilacs out of the dead land, mixing"));
        poemLines.add(new StringBuilder("Memory and desire, stirring"));
        poemLines.add(new StringBuilder("Dull roots with spring rain."));
        poemLines.add(new StringBuilder("April is the cruellest month, breeding"));
    }

    public void sortLinesByLength() {
        for (StringBuilder line : poemLines) {
            System.out.println(line);
        }

        System.out.println(" ");

        poemLines.sort(Comparator.comparingInt(o -> o.length()));

        for (StringBuilder sortedLine : poemLines) {
            System.out.println(sortedLine);
        }
    }
}
