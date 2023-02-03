package DesignPattern.StructuralDP.CompositDP;

import java.util.Arrays;

public class CompositRunner {
    public static void main(String[] args) {

        Class classA = new ClassA();
        Class classB = new ClassB();
        Class classC = new ClassC();

        CompositClass compositClass = new CompositClass(Arrays.asList(classA,classB,classC));
        System.out.println("Class Names");
        System.out.println(compositClass.getName());
        System.out.println();
        System.out.println("All Students");
        System.out.println(compositClass.getStudents());

    }
}
