package com.xworkz.entitiesTask.Actor;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actoors")
@Data
@AllArgsConstructor
public class ActorEntity {
    @Id
    @Column(name = "a_id")
    private int aId;
    @Column(name ="a_name")
    private String aName;
    @Column(name = "a_age")
    private String aAge;
    @Column(name ="a_state")
    private String actorState;
    @Column(name = "f_movies")
    private String famousMovies;

}
