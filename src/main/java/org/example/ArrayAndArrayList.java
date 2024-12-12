package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayAndArrayList {
    public static void main(String[] args) {

        //This is kinda wrap an array to a look like list.
        //It can let using some of the list functions to the array like sorting
        String[] originalArray = new String[]{"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));



    }
}
