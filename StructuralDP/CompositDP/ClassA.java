package DesignPattern.StructuralDP.CompositDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassA implements Class{
    List<String> classAList=new ArrayList<>(Arrays.asList("Ali","Ayşe","Merve","Sema"));



    @Override
    public String getName() {
        return "Class A";

    }

    @Override
    public List<String> getStudents() {
        return classAList;
    }
}
