package com.fernandofraga.methodreference;

import com.fernandofraga.data.Student;
import com.fernandofraga.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println;

    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
