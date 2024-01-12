package com.xworkz.entitiesTask.flims;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "film")
@Data
@AllArgsConstructor
public class FilmEntity {
    @Id
    @Column(name = "film_id")
    private int film_id;
    @Column(name = "film_name")
    private String filmName;
    @Column(name = "actor_name")
    private String actorName;
    @Column(name = "actress_name")
    private String actressName;
@Column(name = "director_name")
    private String directorName;
@Column(name = "producer_name")
    private String producerName;
}
