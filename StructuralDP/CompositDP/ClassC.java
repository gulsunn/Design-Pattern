package DesignPattern.StructuralDP.CompositDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassC implements Class{
    List<String> classCList=new ArrayList<>(Arrays.asList("Veli","Kemal","Merve","Sefa"));

    @Override
    public String getName() {
        return "Class C";
    }

    @Override
    public List<String> getStudents() {
        return classCList;
    }
}
