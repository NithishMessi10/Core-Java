package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "super_heroes")
@Data//toString , Getter ,Setter
@AllArgsConstructor
public class SuperHeroEntity {
    @Id
    @Column(name = "s_id")
    private int s_id;
    @Column(name ="s_name")
    private String s_name;
    @Column(name = "s_real_name")
    private String s_realName;
    @Column(name ="s_powers")
    private String powers;
@Column(name = "s_weakness")
    private String weakness;
}
