package com.myapp.struts;
// Generated 24 Mar, 2018 10:28:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Teacher generated by hbm2java
 */
public class Teacher extends org.apache.struts.action.ActionForm  implements java.io.Serializable {


     private String teacherId;
     private Subject subject;
     private Batch batch;
     private String subjectSubjectId;
     private String teacherName;
     private String batchBatchId;
     private Set batches = new HashSet(0);

    public Teacher() {
    }

	
    public Teacher(String teacherId) {
        this.teacherId = teacherId;
    }
    public Teacher(String teacherId, Subject subject, Batch batch, String teacherName, Set batches) {
       this.teacherId = teacherId;
       this.subject = subject;
       this.batch = batch;
       this.teacherName = teacherName;
       this.batches = batches;
       this.batchBatchId=batchBatchId;
    }
   
    public String getTeacherId() {
        return this.teacherId;
    }
    
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public Subject getSubject() {
        return this.subject;
    }
    
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Batch getBatch() {
        return this.batch;
    }
    
    public void setBatch(Batch batch) {
        this.batch = batch;
    }
    public String getTeacherName() {
        return this.teacherName;
    }
    
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public Set getBatches() {
        return this.batches;
    }
    
    public void setBatches(Set batches) {
        this.batches = batches;
    }

    /**
     * @return the batchBatchId
     */
    public String getBatchBatchId() {
        return batchBatchId;
    }

    /**
     * @param batchBatchId the batchBatchId to set
     */
    public void setBatchBatchId(String batchBatchId) {
        this.batchBatchId = batchBatchId;
    }

    /**
     * @return the subjectSubjectId
     */
    public String getSubjectSubjectId() {
        return subjectSubjectId;
    }

    /**
     * @param subjectSubjectId the subjectSubjectId to set
     */
    public void setSubjectSubjectId(String subjectSubjectId) {
        this.subjectSubjectId = subjectSubjectId;
    }




}

