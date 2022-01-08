package com.epam.automation.collections.optionalTaskCollections;

import java.util.*;

public class SortingLinesByLength {
    ArrayList<String> poemLines = new ArrayList<>();
    {
        poemLines.add("Lilacs out of the dead land, mixing");
        poemLines.add("Memory and desire, stirring");
        poemLines.add("Dull roots with spring rain.");
        poemLines.add("April is the cruellest month, breeding");
    }

    public void sortLinesByLength() {
        for (String line : poemLines) {
            System.out.println(line);
        }
        System.out.println(" ");
        poemLines.sort(Comparator.comparingInt(o -> o.length()));
        for (String sortedLine : poemLines) {
            System.out.println(sortedLine);
        }
    }
}
