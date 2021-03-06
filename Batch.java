package com.myapp.struts;
// Generated 24 Mar, 2018 10:28:35 AM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;

/**
 * Batch generated by hbm2java
 */
public class Batch extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private String batchid;
     private String batchstartdate;
     private String batchenddate;
     private String batchdescription;
     private Set teachers = new HashSet(0);
     private Set teachers_1 = new HashSet(0);
     private Set students = new HashSet(0);
     private Set studentabsents = new HashSet(0);
     private Set studentattends = new HashSet(0);

    public Batch() {
    }

	
    public Batch(String batchid) {
        this.batchid = batchid;
    }
    public Batch(String batchid, String batchstartdate, String batchenddate, String batchdescription, Set teachers, Set teachers_1, Set students, Set studentabsents, Set studentattends) {
       this.batchid = batchid;
       this.batchstartdate = batchstartdate;
       this.batchenddate = batchenddate;
       this.batchdescription = batchdescription;
       this.teachers = teachers;
       this.teachers_1 = teachers_1;
       this.students = students;
       this.studentabsents = studentabsents;
       this.studentattends = studentattends;
    }
   
    public String getBatchid() {
        return this.batchid;
    }
    
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }
    public String getBatchstartdate() {
        return this.batchstartdate;
    }
    
    public void setBatchstartdate(String batchstartdate) {
        this.batchstartdate = batchstartdate;
    }
    public String getBatchenddate() {
        return this.batchenddate;
    }
    
    public void setBatchenddate(String batchenddate) {
        this.batchenddate = batchenddate;
    }
    public String getBatchdescription() {
        return this.batchdescription;
    }
    
    public void setBatchdescription(String batchdescription) {
        this.batchdescription = batchdescription;
    }
    public Set getTeachers() {
        return this.teachers;
    }
    
    public void setTeachers(Set teachers) {
        this.teachers = teachers;
    }
    public Set getTeachers_1() {
        return this.teachers_1;
    }
    
    public void setTeachers_1(Set teachers_1) {
        this.teachers_1 = teachers_1;
    }
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }
    public Set getStudentabsents() {
        return this.studentabsents;
    }
    
    public void setStudentabsents(Set studentabsents) {
        this.studentabsents = studentabsents;
    }
    public Set getStudentattends() {
        return this.studentattends;
    }
    
    public void setStudentattends(Set studentattends) {
        this.studentattends = studentattends;
    }




}


