package com.fernandofraga.functionalinterfaces;

import com.fernandofraga.data.Student;
import com.fernandofraga.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void main(String[] args) {

        //filterStudentGradeLevel();
        filterStudentGpaAndGradeLevel();
    }

    public static void filterStudentGradeLevel() {
        List<Student> studentList =  StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentGpa() {
        List<Student> studentList =  StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentGpaAndGradeLevel() {
        List<Student> studentList =  StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p2.and(p1).test(student)) {
                System.out.println(student);
            }
        });
    }
}
