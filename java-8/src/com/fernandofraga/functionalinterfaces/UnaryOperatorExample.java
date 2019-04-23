package com.fernandofraga.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s -> s.concat("Cool!"));

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Fernando is not "));
    }
}
