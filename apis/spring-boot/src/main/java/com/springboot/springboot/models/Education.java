package com.springboot.springboot.models;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "education")
public class Education implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "educationId")
    private Long educationId;

    @Column(name = "institutionName", length = 100)
    private String institutionName;

    @Column(name = "degree", length = 100)
    private String degree;

    @Column(name = "graduationYear")
    private Integer graduationYear;

    public Education() {
    }

    public Education(String institutionName, String degree, int graduationYear) {
        this.institutionName = institutionName;
        this.degree = degree;
        this.graduationYear = graduationYear;
    }

    public Long getEducationId() {
        return educationId;
    }
    
    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
        return "Education [educationId=" + educationId + ", institutionName=" + institutionName + ", degree=" + degree + ", graduationYear=" + graduationYear + "]";
    }
}
