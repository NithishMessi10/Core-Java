package com.xworkz.entitiesTask.traffic;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traffic_signals")
@Data
@AllArgsConstructor
public class TrafficEntity {

    @Id
    @Column(name = "tfs_id")
    private int trafficId;
    @Column(name = "tfs_name")
    private String trafficSignalName;
    @Column(name = "tfs_area")
    private String trafficSignalArea;
@Column(name = "tfs_cameras")
    private int trafficCameras;

}
