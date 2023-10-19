package com.xworkz.playstoreapp.softwareHub;

import com.xworkz.playstoreapp.application.Application;

import java.util.Arrays;
import java.util.Scanner;

// software hub is used to perform crud operations  applications and dependent on applications
public class SoftwareHub {


    Application application[];
    int index;

    public SoftwareHub(int size) {
        application = new Application[size];
    }


    public void addApplications(Application application){

        if(application!=null){
                this.application[index] = application;
                index++;
            }
        }

    public void getApplicationsNames() {

      // System.out.println(application.length);
            for (int index = 0; index < application.length; index++) {
                System.out.println("invoking get application names");
                System.out.println("The length of the array is"+application.length);
                    System.out.println("The Id is"+application[index].getAppId());
                    System.out.println("The App Name is" +application[index].getAppName());
                    System.out.println("The App size is" + application[index].getAppInSize());
                    System.out.println("The App release date is" + application[index].getReleaseDate());
                    System.out.println("The App type is " + application[index].getAppType());
                    System.out.println("The App version is" + application[index].getAppVersion());
                System.out.println("-------------------------");
            }

    }

/////////////////getting or reading by giving appNAme by searching appname we want apps
    /// w.k.t we have appName inside arrray inside object if that we have to return entire object
    // requirements for loop and if
    public Application getApplicationByName(String appName){
        System.out.println("-------------------------");
        System.out.println("invoking get Application by Name by appName");

        Application applicationref=null;
        ////// important  that we want return type of application by giving appName it will return Application
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppName().equals(appName)){
                applicationref=application[appIndex]; // assigning the values from right to left

            }
        }
        return applicationref;
    }

    ///// getApplication by its id ////////////////////////////////////////////////////////////////////
    public String getApplicationByItsId(int appId){
        System.out.println("-------------------------");
        System.out.println("Invoking getApplication By its ID ");
        System.out.println("The Id you are Giving is "+appId);
        String appref=null;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppId()==appId){
                appref=application[appIndex].getAppName();
            }
        }
        return appref;
    }
//////////////////////get Application by app type (String appType)//////////////////////////////////////
    public  String getApplicationByAppType(String appType){
        System.out.println("--------------------------------");
        System.out.println("Inside Getting  Application by Its App type ");
        String gettingAppbyApptyperef=null;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppType().equals(appType)){
                gettingAppbyApptyperef=application[appIndex].getAppName();
            }
        }
        return gettingAppbyApptyperef;
    }

/////////////////////get ApplicationName by type (String appType)///////////////////////////////////////
    public String getApplicationNameByType(String appType){
        System.out.println("----------------------------");
        System.out.println("Inside method get Application Name by Application Type");
        System.out.println("You are searching for --"+appType+"Categories");
        String getApplicationNamebytype=null;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppType()==appType){
               getApplicationNamebytype=application[appIndex].getAppName();

            }
        }
      return  getApplicationNamebytype;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////// get application size by name///////////////////////////////////
    public double getApplicationSizeByName(String appName){
        System.out.println("-------------------------------");
        System.out.println("Inside the method get application size by name");
        double ref=0;
        System.out.println("The App which is searched is"+appName);
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppName()==appName){
                ref=application[appIndex].getAppInSize();
            }
        }
        if(ref>0){
            System.out.println("The App found");
        }
        else {
            System.out.println("The app not found");
        }
        return ref;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    ////////////////Get application release date by searching appName////////////////////////

    public String getDateByAppName(String appName){
        System.out.println("-------------------------------------");
        System.out.println("Inside the method Get Date by AppName");
        String refDate=null;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppName().equals(appName)){
                refDate=application[appIndex].getReleaseDate();
            }
        }
        if(refDate!=null){
            System.out.println("The App found");
        }
        else {
            System.out.println("The App not found");
        }
        return refDate;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////// update app by app version by using appName//////////////////////

    public boolean updateVersionByAppName(String appName,String newVersion){
        System.out.println("---------------------------------------");
        System.out.println("Inside the update Method  updating app version by app name");
        boolean isUpdated=false;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppName()==appName){
                application[appIndex].setAppVersion(newVersion);
                isUpdated=true;
                System.out.println("The app is updated to new version"+application[appIndex].getAppVersion());
            }
        }
        if (isUpdated==true){
            System.out.println("The app version got updated ");

        }
        else {
            System.out.println("The app version got not updated");
        }
        return isUpdated;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////  update name by giving id //////////////////////////////////////////
    public boolean updateAppByDetails(String appName,String releaseDate,String appType,double appSize){
        boolean isUpdated=false;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[appIndex].getAppName()==appName){
                application[appIndex].setReleaseDate(releaseDate);
                application[appIndex].setAppType(appType);
                application[appIndex].setAppInSize(appSize);
                isUpdated=true;
                application[appIndex].getReleaseDate();
                application[appIndex].getAppType();
                application[appIndex].getAppInSize();
            }

        }
        if(isUpdated==true){
            System.out.println("The app is Updated");
        }
        else {
            System.out.println("The app is Not updated");
        }
        return isUpdated;
    }

    ///////////////////////////////////// Delete the whole index/////////////////////////////////////
   /*
    public void deleteAppbyAppName(String appName){
        Application newApplication[] =new Application[application.length-1];
        int anotherIndex=0;
        for(int appIndex=0;appIndex<this.application.length;appIndex++){
            if(application[index].getAppName() != appName){
                newApplication[anotherIndex]=application[appIndex];
                anotherIndex++;
            }
        }
       System.out.println("Reading new array elements after deleting 1 index");
        for(int i=0; i< newApplication.length;i++){
            System.out.println(newApplication[i].getAppName()+" "+
                                newApplication[i].getAppVersion()+" "+
                                newApplication[i].getAppType()+"    "+
                                newApplication[i].getReleaseDate()+"      "+
                                newApplication[i].getAppId()+"  "+
                                newApplication[i].getAppInSize()+"  "+
                                newApplication[i].getOwnerName());
        }


    }

    */

    /////////////////////// Deleting the index by using ARRAY FUNCTIONS COPY OF////////////////////
    public void deleteIndex(String appName){
        System.out.println("Inside the delete method that is copy of function");
        int index,anotherIndex;
        for( index=0,anotherIndex=0;index<this.application.length;index++){
            if(application[index].getAppName()!=appName){
                application[anotherIndex]=application[index];
                anotherIndex++;
               // System.out.println("deleting is happening");
            }

        }
        System.out.println("Delete operation is done ");

        application = Arrays.copyOf(application,anotherIndex);
        getNewApplications(application);
    }

    public void getNewApplications(Application[] application) {
        for (int i = 0; i < application.length; i++) {
            System.out.println(application[i].getAppName()+" "+
                                application[i].getAppType()+""+
                    application[i].getReleaseDate()+""+
                    application[i].getAppVersion()+""+
                    application[i].getAppInSize()+""+
                    application[i].getAppId()+""+
                    application[i].getOwnerName());

        }
    }
}


