package com.xworkz.entitiesTask.resumes;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resume")
@Data
@AllArgsConstructor
public class ResumeEntity {
    @Id
    @Column(name = "r_id")
    private int resumeId;
    @Column(name ="r_name")
    private String resumeName;
    @Column(name = "r_appliedfor")
    private String resumeAppliedfor;
    @Column(name ="r_selectedfor")
    private String resumeSelectedFor;
    @Column(name = "r_phNo")
    private String resumePhoneNo;
}
