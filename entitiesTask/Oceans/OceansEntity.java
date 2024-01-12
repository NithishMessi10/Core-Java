package com.xworkz.entitiesTask.Oceans;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oceans")
@Data
@AllArgsConstructor
public class OceansEntity {
    @Id
    @Column(name = "o_id")
    private int o_id;
    @Column(name ="o_name")
    private String o_name;
    @Column(name = "o_country")
    private String oceanCountry;
    @Column(name ="o_speciality")
    private String oceanSpeciality;
    @Column(name = "no_of_islands")
    private String noOfIslands;
}
