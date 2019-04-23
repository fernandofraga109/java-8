package com.fernandofraga.functionalinterfaces;

import com.fernandofraga.data.Student;
import com.fernandofraga.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3+9;
    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("name: "+ name +"| activities: "+ activities);
    static Consumer<Student> studentConsumer = s -> {

        /*if (p1.and(p2).test(s)) {
            biConsumer.accept(s.getName(), s.getActivities());
        }*/

        if (biPredicate.test(s.getGradeLevel(), s.getGpa())) {
            biConsumer.accept(s.getName(), s.getActivities());
        }
    };


    public static void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> list = StudentDataBase.getAllStudents();
        printNameAndActivities(list);

    }
}
