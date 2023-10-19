package com.xworkz.examapplication.hallticket;

public class HallTicket {

    String candidateName;
    String usnNo;
    String subjectName;
    String subjectCode;

    public HallTicket(String candidateName,String usnNo,String subjectName,String subjectCode){
        this.candidateName=candidateName;
        this.usnNo=usnNo;
        this.subjectName=subjectName;
        this.subjectCode=subjectCode;
    }

    public void displayDetails() {
        System.out.println("The candidate Name is " + this.candidateName);
        System.out.println("The candidate USN Number is " + this.usnNo);
        System.out.println("The candidate Opted subjects is " + this.subjectName);
        System.out.println("The candidate Opted subjects code is " + this.subjectCode);

    }
}
