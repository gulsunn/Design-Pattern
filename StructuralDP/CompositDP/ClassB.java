package DesignPattern.StructuralDP.CompositDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassB implements Class {
    List<String> classBList = new ArrayList<>(Arrays.asList("Mehmet","Furkan","Pelin","Kaan"));
    @Override
    public String getName() {
        return "Class B";

    }

    @Override
    public List<String> getStudents() {
       return classBList;
    }
}
