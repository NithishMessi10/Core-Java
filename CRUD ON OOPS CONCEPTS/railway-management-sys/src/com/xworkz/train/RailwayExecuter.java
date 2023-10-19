package com.xworkz.train;
import com.xworkz.train.irctc.Irctc;
import com.xworkz.train.Train;
import java.util.Scanner;


public class RailwayExecuter {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of trains to be added");
        int size=sc.nextInt();

        Irctc irctc=new Irctc(size);
        for (int index=0;index<size;index++){
            Train train =new Train();
            System.out.println("Enter the train pnrno");
            train.setPnrNo(sc.nextInt());
            System.out.println("Enter the train  name");
            train.setTrainName(sc.next());
            System.out.println("Enter the train type");
            train.setTrainType(sc.next());
            System.out.println("Enter the no of coaches");
            train.setNoCoaches(sc.nextInt());
            System.out.println("Enter the  no ac coaches");
            train.setNoAcCoaches(sc.nextInt());
            System.out.println("Enter the departure timing");
            train.setDepartertiming(sc.next());
            System.out.println("Enetr the reach time");
            train.setReachTime(sc.next());
            System.out.println("Enetr the starting pointy");
            train.setReachTime(sc.next());
            System.out.println("Enetr the ending point");
            train.setEndpoint(sc.next());
            irctc.addTrain(train);

        }



        /////////////////////////////BY using DO WHILE AND SWITCH STATENENTS ////////////////////////
        String input = null;

        do {
            System.out.println("Inside Do while loop");
            System.out.println("Press 1: get all train names");
            System.out.println("Press 2: get all passenger by pnr ");
            System.out.println("Press 3: get all train starting point by ending point");
            System.out.println("Press 4: get all train name by ending point");
            System.out.println("Press 5: get all train names by coaches");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    irctc.getAllTrain();
                    break;
                case 2:
                    String ref =irctc.getAllTrainsByPnr(sc.nextInt());
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("train names by ending point");;
                    break;
                case 5:
                    System.out.println("train name by starting point");
                    break;
                default:
                    System.out.println("Choose the option available ");
            }
            System.out.println("Press Y to continue X to close");
            input = sc.next();


        } while (input.equals("Y"));
        System.out.println("Thank you for using our service");


    }
}