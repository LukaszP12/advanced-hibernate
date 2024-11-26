package com.baeldung.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "image")
public class Image {

    public Image() {
    }

    @Id
    @Column(name = "file_name")
    private String file_name;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Image(String file_name) {
        this.file_name = file_name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}
