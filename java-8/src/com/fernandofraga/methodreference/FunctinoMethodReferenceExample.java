package com.fernandofraga.methodreference;

import java.util.function.Function;

public class FunctinoMethodReferenceExample {

    static Function<String, String> toUpperFunction = (s) -> s.toUpperCase();

    static Function<String, String> toUpperFunctionReference = String::toUpperCase;


    public static void main(String[] args) {
        toUpperFunction.apply("java8");
        toUpperFunctionReference.apply("java88");
    }


}
