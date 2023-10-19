package com.xworkz.examapplication;

import com.xworkz.examapplication.exam.Exam;
import com.xworkz.examapplication.exam.SupplementaryExam;
import com.xworkz.examapplication.hallticket.HallTicket;

public class ExamExecuter {
    public static void main(String args[]) {

        HallTicket ticket = new HallTicket("Nithish", "4JN19EC066", "Network Theory", "18ec31");
// polymorphism
        Exam exam = new SupplementaryExam();   // most of time has a relationship with methods only
      // Exam exam=new SupplementaryExam();
       // exam.setFees(1500);
      //  exam.getFees();
        //exam.write(ticket);

        SupplementaryExam supplementaryExam= (SupplementaryExam) exam;
       // supplementaryExam.setFees(0);
      //  supplementaryExam.getFees();
        supplementaryExam.write(ticket,1200);//checking for method invokation or not


        //exam.write(ticket,1200); this we cannot use because we have are tryiing to use parent method without using child reference
        //exam.write(ticket); // this is important because exam is to write with the help of ticket  exam will be given only when ticket is there and if we have ticket we can write
        // calling classtype variable as parameter


    }
}
