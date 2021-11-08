package com.dimas.pbo.modul5.percobaan.school;
public class Student {
    private String name;
    private int nrp;
    
    
    public Student(){
        this(0,"null");
    }
    
    public Student (String name){
        this(0,name);
    }
    
    public Student(int nrp, String name){
        this.nrp = nrp;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNrp(){
        return this.nrp;
    } 
    
 
    
}
