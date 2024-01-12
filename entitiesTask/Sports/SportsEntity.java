package com.xworkz.entitiesTask.Sports;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
@Data
@AllArgsConstructor
public class SportsEntity {
    @Id
    @Column(name = "s_id")
    private int s_id;
    @Column(name ="sports_name")
    private String sportsName;
    @Column(name ="no_players")
    private String noOfPlayers;
    @Column(name ="mode")
    private String modeOfSports;
    @Column(name = "famousPlayers")
    private String famousPlayers;
}
