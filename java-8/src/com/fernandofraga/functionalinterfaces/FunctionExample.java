package com.fernandofraga.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> {
        System.out.println("Function executed...");
        return name.toUpperCase();
    };

    static Function<String, String> functionAddString = (name) -> {
        System.out.println("FunctionAddString executed...");
        return name.toUpperCase().concat("stringAdded");

    };

    public static void main(String[] args) {
        System.out.println("Result of function: "+function.andThen(functionAddString).andThen(function).apply("fernando"));

        System.out.println("Result of function: "+function.compose(functionAddString).apply("fernando"));
    }
}
