package com.xworkz.entitiesTask.Transport;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transport")
@Data
@AllArgsConstructor
public class TransportEntity {
    @Id
    @Column(name = "t_id")
    private int t_id;
    @Column(name ="t_name")
    private String t_name;
    @Column(name = "t_mode")
    private String tMode;
    @Column(name ="t_type")
    private String tType;
    @Column(name = "app_pass")
    private String approxPassengers;
}
