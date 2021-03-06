package com.myapp.struts;
// Generated 24 Mar, 2018 10:28:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Student generated by hbm2java
 */
public class Student extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private String studentRegdNo;
     private Batch batch;
     private String batchBatchId;
     
     private String studentName;
     private String department;
     private String semester;
     private Set studentattends = new HashSet(0);
     private Set studentabsents = new HashSet(0);

    public Student() {
    }

	
    public Student(String studentRegdNo) {
        this.studentRegdNo = studentRegdNo;
    }
    public Student(String studentRegdNo, Batch batch, String studentName, String department, String semester,String batchBatchId, Set studentattends, Set studentabsents) {
       this.studentRegdNo = studentRegdNo;
       this.batch = batch;
       this.batchBatchId=batchBatchId;
       this.studentName = studentName;
       this.department = department;
       this.semester = semester;
       this.studentattends = studentattends;
       this.studentabsents = studentabsents;
    }
   
    public String getStudentRegdNo() {
        return this.studentRegdNo;
    }
    
    public void setStudentRegdNo(String studentRegdNo) {
        this.studentRegdNo = studentRegdNo;
    }
    public Batch getBatch() {
        return this.batch;
    }
    
    public void setBatch(Batch batch) {
        this.batch = batch;
    }
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSemester() {
        return this.semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public Set getStudentattends() {
        return this.studentattends;
    }
    
    public void setStudentattends(Set studentattends) {
        this.studentattends = studentattends;
    }
    public Set getStudentabsents() {
        return this.studentabsents;
    }
    
    public void setStudentabsents(Set studentabsents) {
        this.studentabsents = studentabsents;
    }

    /**
     * @return the batchid
     */
    public String getBatchBatchId() {
        return batchBatchId;
    }

    /**
     * @param batchid the batchid to set
     */
    public void setBatchBatchId(String batchBatchId) {
        this.batchBatchId= batchBatchId;
    }




}


