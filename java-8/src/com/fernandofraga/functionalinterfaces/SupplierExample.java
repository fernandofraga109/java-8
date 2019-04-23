package com.fernandofraga.functionalinterfaces;

import com.fernandofraga.data.Student;
import com.fernandofraga.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();



        System.out.println(listSupplier.get());
    }
}
