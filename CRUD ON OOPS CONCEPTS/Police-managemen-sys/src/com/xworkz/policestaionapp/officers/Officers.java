package com.xworkz.policestaionapp.officers;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Officers {

    private int officerId;
    private String officerName;
    private int officerAge;
    private String gender;
    private String postName;
    private String officerAddress;
    private String bloodGroup;



}
