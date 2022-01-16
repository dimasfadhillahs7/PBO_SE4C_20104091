package com.dimas.pbo.modul5.percobaan;
import com.dimas.pbo.modul5.percobaan.school.*;
public class MainSchool {
    public static void main(String[] args) {
        Classroom classA = new Classroom (101,"Class 101");
        Classroom classB = new Classroom (102,"Class 102");
        Classroom classC = new Classroom (103,"Class 103");
    
        classA.setStudent(new Student());
        classB.setStudent(new Student("Falah"));
        classC.setStudent(new Student(001,"Fajar"));
        
        
        //Class A
        System.out.print(classA.getClassCode()+" "+classA.getClassName()+" With student\t: ");
        System.out.println(classA.getStudent().getNrp()+" "+classA.getStudent().getName());
    
        //Class B
        System.out.print(classB.getClassCode()+" "+classB.getClassName()+" With student\t: ");
        System.out.println(classB.getStudent().getNrp()+" "+classB.getStudent().getName());
    
        //Class C
        System.out.print(classC.getClassCode()+" "+classC.getClassName()+" With student\t: ");
        System.out.println(classC.getStudent().getNrp()+" "+classC.getStudent().getName());
    
    
    }
    
}
