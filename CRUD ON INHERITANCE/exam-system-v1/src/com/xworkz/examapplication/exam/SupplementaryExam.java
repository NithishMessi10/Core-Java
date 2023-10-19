package com.xworkz.examapplication.exam;


import com.xworkz.examapplication.hallticket.HallTicket;

public class SupplementaryExam extends Exam {
    public int noOfAttempts=2;


    public SupplementaryExam() {
        super();
    }



    /*public boolean write(HallTicket ticket) {

        int noOfAttempts=2;
        if(noOfAttempts>1)
            return super.write(ticket);




        return false;
        }
    }*/
public void write(HallTicket ticket,int fees){
    System.out.println("inside the child class method");
}
}



