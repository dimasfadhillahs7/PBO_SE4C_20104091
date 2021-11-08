package com.dimas.pbo.modul5.percobaan.school;
public class Classroom {
    private int classCode;
    private String className;
    private Student student;
    
    public Classroom(int classCode, String className){
        this.classCode = classCode;
        this.className = className;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
    
    
    public String getClassName(){
        return this.className;
    }
    
    public int getClassCode(){
        return this.classCode;
    }
    
    public Student getStudent(){
        return this.student;
    }
}
