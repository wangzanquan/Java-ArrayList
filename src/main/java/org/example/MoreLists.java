package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apple", "orange", "banana", "milk", "grapes"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("carrot");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        //Search arraylist element:
        if(groceries.contains("banana")){
            System.out.println("List contains banana");
        }

        //Find element with same name index:
        groceries.add("banana");
        System.out.println("First = " + groceries.indexOf("banana"));
        System.out.println("Last = " + groceries.lastIndexOf("banana"));

        //Remove element by index
        System.out.println(groceries);
        System.out.println(groceries.get(1));
        groceries.remove(1);
        System.out.println(groceries);

        //Remove element by name
        //The REMOVE method only remove ONE element at a time
        groceries.remove("banana");
        System.out.println(groceries);

        //Remove multiple elements:
        groceries.removeAll(List.of("banana", "grapes"));
        System.out.println(groceries);

        //Opposite of remove: retain - only retain mentioned elements, and remove all others
        groceries.retainAll(List.of("carrot", "pickles"));
        System.out.println(groceries);

        //Remove all (clear out) elements of the list
        groceries.clear();
        System.out.println("isEmpty = " + groceries.isEmpty());

        //Add elements as list
        groceries.addAll(List.of("carrot", "pickles"));
        groceries.addAll(Arrays.asList("eggs", "cheese"));
        System.out.println(groceries);

        //Sort the list
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        //Sort reversely
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //Create an array with same type same element of that list
        var grocerArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(grocerArray));
        System.out.println(grocerArray[0]);


    }
}
