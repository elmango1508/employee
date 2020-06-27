/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.io.Serializable;

/**
 *
 * @author tuanpham
 */
public class Student implements Serializable{
    public String StudentID;
    public String StudentName;
    public int ClassName;

    Student() {
        
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getClassName() {
        return ClassName;
    }

    public void setClassName(int Class1) {
        this.ClassName = ClassName;
    }

    
    public Student(String StudentID, String StudentName, int Class) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.ClassName = ClassName;
    }
     
}
