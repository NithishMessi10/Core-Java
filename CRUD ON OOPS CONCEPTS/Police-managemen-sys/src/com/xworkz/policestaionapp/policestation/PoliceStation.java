package com.xworkz.policestaionapp.policestation;

import com.xworkz.policestaionapp.officers.Officers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoliceStation {


    Officers officers[];
    int index;
    int id=1;

    public PoliceStation(int size){
        officers=new Officers[size];
    }
    //adding officers



    public boolean addOfficers(Officers officers) {
        boolean isAdded = false;
        if (officers != null) {
            officers.setOfficerId(id++);
            this.officers[index] = officers;
            index++;
            isAdded = true;
        }

        return isAdded;
    }

    public void getOfficers() {
        System.out.println("------------------------------");
        System.out.println("Adding Officers");
        for (int index = 0; index < this.officers.length; index++) {
            System.out.println(officers[index].getOfficerId());
            System.out.println(officers[index].getOfficerName());
            System.out.println(officers[index].getOfficerAge());
            System.out.println(officers[index].getOfficerAddress());
            System.out.println(officers[index].getBloodGroup());
            System.out.println(officers[index].getPostName());
            System.out.println(officers[index].getGender());
            System.out.println("-----------------------------");
        }
    }
/*
    ////////////////////////////// get Officers Name by Post Name//////////////////////////////////////////////////////////////////////////
    public String[] getOfficersNameByPostName(String postName){
        System.out.println("Inisde get officers by post name ");
        int size=0;
        String[] dummy=new String[size];


    }
        ///////////////////////////////////////////////// GET ADRESS BY ID //////////////////////////////////////////////////////////////////////////////
/*
    public String getAdressById(int id){
        System.out.println("----------------------------");
        System.out.println("Inside Method-2 get Adress By id");
        String ref=null;
        for (int i = 0; i < officers.length; i++) {
            if(officers[i].getOfficerId()==id){
                ref=officers[i].getOfficerAddress(); //officers[i].getOfficerName();

            }

        }
        if(ref!=null){
            System.out.println("The officer id by adress is found");
        }
        else {
            System.out.println("Error");
        }

        return ref;
    }


 */






























































    }

