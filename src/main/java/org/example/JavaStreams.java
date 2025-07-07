package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaStreams {
    public static void main(String[] args) {

        // ~~~~~ Activity 1 ~~~~~
        List <Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isOdd = n -> n % 2 != 0;

        //  defined allOdds List with Integer types that stores all ODD numbers in list1 List
        List <Integer> allOdds = list1.stream()
                .filter(isOdd)
                .collect(Collectors.toList());

        //~~~~~ Output for Activity 1 ~~~~~
        System.out.println(allOdds);

    }
}