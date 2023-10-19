package com.xworkz.train;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Train {

        private int pnrNo;
        private String trainName;
        private String trainType;
        private int noCoaches;
        private int noAcCoaches;
        private String departertiming;
        private String reachTime;
        private String startingpoint;
        private String endpoint;


    }

