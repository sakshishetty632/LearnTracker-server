package com.learntrack.learn_track_server.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "student_progress")  // MongoDB Collection Name
public class StudentProgress {

    @Id
    @JsonProperty("student_id")
    private String studentId;

    @JsonProperty("branch")
    private String branch;

    @JsonProperty("course")
    private String course;

    @JsonProperty("student_name")
    private String studentName;

    @JsonProperty("learning_modules")
    private String learningModules;

    @JsonProperty("grade")
    private String grade;

    @JsonProperty("performance_note")
    private String performanceNote;

    // Constructors
    public StudentProgress() {
    }

    public StudentProgress(String studentId, String branch, String course, String studentName,
                           String learningModules, String grade, String performanceNote) {
        this.studentId = studentId;
        this.branch = branch;
        this.course = course;
        this.studentName = studentName;
        this.learningModules = learningModules;
        this.grade = grade;
        this.performanceNote = performanceNote;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getLearningModules() {
        return learningModules;
    }

    public void setLearningModules(String learningModules) {
        this.learningModules = learningModules;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPerformanceNote() {
        return performanceNote;
    }

    public void setPerformanceNote(String performanceNote) {
        this.performanceNote = performanceNote;
    }
}