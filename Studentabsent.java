package com.myapp.struts;
// Generated 24 Mar, 2018 10:28:35 AM by Hibernate Tools 4.3.1



/**
 * Studentabsent generated by hbm2java
 */
public class Studentabsent extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private StudentabsentId id;
     private Student student;
     private Batch batch;
     private String studentRegdNo;
     private String batchid;
     private String adate;

    public Studentabsent() {
    }

    public Studentabsent(StudentabsentId id, Student student, Batch batch) {
       this.id = id;
       this.student = student;
       this.batch = batch;
       this.studentRegdNo = studentRegdNo;
       this.batchid=batchid;
       this.adate=adate;
    }
   
    public StudentabsentId getId() {
        return this.id;
    }
    
    public void setId(StudentabsentId id) {
        this.id = id;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public Batch getBatch() {
        return this.batch;
    }
    
    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    /**
     * @return the studentRegdNo
     */
    public String getStudentRegdNo() {
        return studentRegdNo;
    }

    /**
     * @param studentRegdNo the studentRegdNo to set
     */
    public void setStudentRegdNo(String studentRegdNo) {
        this.studentRegdNo = studentRegdNo;
    }

    /**
     * @return the batchid
     */
    public String getBatchid() {
        return batchid;
    }

    /**
     * @param batchid the batchid to set
     */
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    /**
     * @return the adate
     */
    public String getAdate() {
        return adate;
    }

    /**
     * @param adate the adate to set
     */
    public void setAdate(String adate) {
        this.adate = adate;
    }




}


