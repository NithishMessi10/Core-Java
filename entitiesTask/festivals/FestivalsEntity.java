package com.xworkz.entitiesTask.festivals;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="festivals")
@Data
@AllArgsConstructor
public class FestivalsEntity {
    @Id
    @Column(name = "f_id")
    private int f_id;
    @Column(name ="f_name")
    private String f_name;
    @Column(name = "f_origin")
    private String festivalOrigin;
    @Column(name ="f_celebrated")
    private String festivalCelebrated;
    @Column(name = "f_speciality")
    private String festibalSpeciality;
}
