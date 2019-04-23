package com.fernandofraga.functionalinterfaces;

import com.fernandofraga.data.Student;
import com.fernandofraga.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer1 = (s) -> System.out.println(s.getName());
    static Consumer<Student> consumer2 = (s) -> System.out.println(s.getActivities());
    static Consumer<Student> consumer3 = (s) -> System.out.println(s.getName());

    public static void main(String[] args) {

        Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
        //c.accept("java 8");

        Consumer<Student> conS = (st) -> {st.setName("Fernando");  System.out.println(st);};
        conS.accept(StudentDataBase.getAllStudents().get(0));




        //printName();

        printNameActivities();
        //printNameActivitiesConditional();
    }

    public static void printName() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer1);
    }

    public static void printNameActivities() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer1.andThen(consumer2)); // consumer chaining
    }

    public static void printNameActivitiesConditional() {

        List<Student> studentList = StudentDataBase.getAllStudents();


        studentList.forEach(student ->  {
            if (student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
                consumer1.andThen(consumer2.andThen(consumer3)).accept(student);
            }
        });


    }


}
