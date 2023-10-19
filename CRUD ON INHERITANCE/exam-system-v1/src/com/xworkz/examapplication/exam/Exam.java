package com.xworkz.examapplication.exam;

import com.xworkz.examapplication.hallticket.HallTicket;
public  class Exam {
    // instance variable and type class type
    public HallTicket ticket;


    // fees must be required
    private int fees;

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    // we know that exam is given to us when we clear the fees or ia clearence then only hall ticket is given

    public Exam(){
        this.ticket=ticket;
    }   // we can also intialize by constructor type

    public boolean write(HallTicket ticket){
        boolean isAllowed=false;



        if(fees>=1200){
            System.out.println("Exam fees is Paid... Good Luck for Exams");




            if(ticket!=null){
                //this.ticket=ticket;   // i have written this because passing parameter of non primmitive data is the practice we can also intialize by method type
                this.ticket.displayDetails();
                System.out.println("Hall ticket details are given is cleared");
                isAllowed=true;




            }
            else{
                System.out.println("Hall Ticket details are not found");
            }



        }
        else{
            System.out.println("Paying Fees is mandatatory for writing the exam");
        }



        return isAllowed;
    }



}

