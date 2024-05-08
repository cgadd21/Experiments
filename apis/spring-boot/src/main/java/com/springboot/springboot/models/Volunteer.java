package com.springboot.springboot.models;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "volunteer")
public class Volunteer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "volunteerId")
    private Long volunteerId;

    @Column(name = "jobTitle", length = 100)
    private String jobTitle;

    @Column(name = "companyName", length = 100)
    private String companyName;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "link", length = 255)
    private String link;

    public Volunteer() {
    }

    public Volunteer(String jobTitle, String companyName, String description, String link) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.description = description;
        this.link = link;
    }

    public Long getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Long volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Volunteer [volunteerId=" + volunteerId + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", description=" + description + ", link=" + link + "]";
    }
}
