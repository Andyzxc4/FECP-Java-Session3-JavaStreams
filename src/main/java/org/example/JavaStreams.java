package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {

        // ~~~~~ Activity 1 ~~~~~
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isOdd = n -> n % 2 != 0;

        //  defined allOdds List with Integer types that stores all ODD numbers in list1 List
        List<Integer> allOdds = list1.stream()
                .filter(isOdd)
                .collect(Collectors.toList());

        //~~~~~ Output for Activity 1 ~~~~~
        System.out.println("-- Activity 1 --");
        System.out.printf("Initial list: %s\n", list1);
        System.out.printf("List of all Odds: %s\n", allOdds);

        // ============================

        // ~~~~~ Activity 2 ~~~~~
        List<String> names = Arrays.asList("Alice", "Adam", "Bob", "Angela", "Brian");

        Predicate<String> startsWithA = x -> x.startsWith("A");

        List<String> listStartsWithA = names.stream()
                .filter(startsWithA)
                .toList();

        //~~~~~ Output for Activity 2 ~~~~~
        System.out.println("\n-- Activity 2 --");
        System.out.printf("Initial name list: %s\n", names);
        System.out.printf("List of names start with 'A': %s\n", listStartsWithA);

        // ============================

        // ~~~~~ Activity 3 ~~~~~
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squareOfNumbers = list2.stream()
                .map(num -> num * num)
                .toList();

        //~~~~~ Output for Activity 3 ~~~~~
        System.out.println("\n-- Activity 3--");
        System.out.printf("List before square up: %s\n", list2);
        System.out.printf("List after square: %s\n", squareOfNumbers);

        // ============================

        // ~~~~~ Activity 4 ~~~~~
        




    }
}