package com.fernandofraga.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {

        /**
         * imperative
         */
        int sum = 0;
        for( int i = 0; i<=100;i++)   {
            sum += i; // shared mutable state and its sequential anf it will go step by step
            // and it will have issues if we try to run the code in multithreaded environment
        }

        /**
         * declarative
         */
        int sum1 = IntStream.rangeClosed(0,100 ).sum();


        List<Integer> integerList =Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);

        /**
         * Imperative Style
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i :integerList)
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        System.out.println("unique List : " + uniqueList);

        /**
         * Declarative Syle
         */

        List<Integer> unitList2 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("unique List 2: " + uniqueList);
    }

}
