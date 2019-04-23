package com.fernandofraga.functionalinterfaces;

import com.fernandofraga.data.Student;
import com.fernandofraga.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: "+a + " b: "+b );
        };

        biConsumer.accept("TestA", "TestB");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiply result: "+(a*b) );
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Division result: "+(a/b) );
        };

        multiply.andThen(division).accept(10, 5);

        nameAdnActivities();
    }


    public static void nameAdnActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> biConsumer = (name, activities) ->  System.out.println(name+ " : "+ activities );
        studentList.forEach(s -> biConsumer.accept(s.getName(), s.getActivities()));
    }
}
