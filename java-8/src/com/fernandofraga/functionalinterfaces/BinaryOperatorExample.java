package com.fernandofraga.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Double> binaryOperator = (a, b) -> a * b;
    static Comparator<Double> comparator = (a, b) -> a.compareTo(b);
    static BinaryOperator<Double> binaryOperatorMaxBy = BinaryOperator.maxBy(comparator);
    static BinaryOperator<Double> binaryOperatorMinBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(5.5,9.1));
        System.out.println("Result of max "+ binaryOperatorMaxBy.apply(5D, 3D));
        System.out.println("Result of min "+ binaryOperatorMinBy.apply(5D, 3D));
    }
}
