package com.xworkz.train.irctc;
import com.xworkz.train.Train;
public class Irctc {
    Train train[];

    public Irctc(int size) {
        train = new Train[size];

    }

    int index;

    public boolean addTrain(Train train) {
        boolean isadded = false;
        if (train != null) {
            this.train[index] = train;
            index++;
            isadded = true;
        }
        return isadded;

    }


    public void getAllTrain() {
        System.out.println("------The list of trains is-----");
        for (int index = 0; index < train.length; index++) {
            System.out.println("PNR no- " + train[index].getPnrNo()
                    + "Train name- " + train[index].getTrainName()
                    + "Train type- " + train[index].getTrainType()
                    + "No of coaches- " + train[index].getNoCoaches()
                    + "No of Ac coaches- " + train[index].getNoAcCoaches()
                    + "Deaprter time- " + train[index].getDepartertiming()
                    + "Reaching time- " + train[index].getReachTime()
                    + "Strting point- " + train[index].getStartingpoint()
                    + "End point- " + train[index].getEndpoint());

        }
    }

    public String getAllTrainsByPnr(int pnrNo) {
        String ref = null;
        for (int index = 0; index < train.length; index++) {
            if (train[index].getPnrNo() == pnrNo) {
                ref = train[index].getTrainName();

            }
        }
        return ref;
    }

    public String getTrainNamesByStrtAndEndPoint(String startPoint, String endPoint) {
        String ref = null;
        for(int index=0;index<train.length;index++) {
            if (train[index].getStartingpoint().equals(startPoint)) {
                if (train[index].getEndpoint().equals(endPoint)) {
                    ref = train[index].getTrainName();
                }
            }
        }
        return  ref;
}

public int getCoachesNumbersByTrainName(String trainName){
        int ref=0;
        for(int index=0;index<train.length;index++){
            if(train[index].getTrainName().equals(trainName)){
                ref=train[index].getNoCoaches();
            }
        }
        return  ref;
}

public  String  getTrainEndPointByReachTime(String reachPoint){
        String ref=null;
        for(int index=0;index<)
}


}

