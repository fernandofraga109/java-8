package com.fernandofraga.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {
        System.out.println("p");
        return i%2==0;};

    static Predicate<Integer> p1 = (i) -> i%2==0;

    static Predicate<Integer> p2 = (i) -> {
        System.out.println("p2");
        return i%5==0;
    };

    public static void main(String[] args) {

        System.out.println(p.test(5));

        System.out.println(p1.test(5));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    public static void predicateAnd() {

        System.out.println("Predicate AND: "+p2.and(p).test(20));

    }

    public static void predicateOr() {

        System.out.println("Predicate OR: "+p2.or(p).test(4));

    }

    public static void predicateNegate() {

        System.out.println("Predicate Negate: "+p2.negate().test(50));

    }
}
