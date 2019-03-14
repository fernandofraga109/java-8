package com.fernandofraga.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Comparing: "+ comparator.compare(1,3));

        /**
         * Java 8
         */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Comparing using lambda: "+ comparatorLambda.compare(1,1));

        // not necessary use the type...
        Comparator<Integer> comparatorLambda1 = (a,  b) -> a.compareTo(b);
        System.out.println("Comparing using lambda 1: "+ comparatorLambda1.compare(1,2));

    }
}
