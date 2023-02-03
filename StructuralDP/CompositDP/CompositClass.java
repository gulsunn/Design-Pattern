package DesignPattern.StructuralDP.CompositDP;

import java.util.List;
import java.util.stream.Collectors;

public class CompositClass implements Class{

    List<Class> allClasses;

    public CompositClass(List<Class> allClasses) {
        this.allClasses = allClasses;
    }

    @Override
    public String getName() {

     return   allClasses.stream().map(Class::getName).collect(Collectors.joining(", "));

    }

    @Override
    public List<String> getStudents() {
        return allClasses.stream().flatMap(d->d.getStudents().stream()).collect(Collectors.toList());
    }
}
