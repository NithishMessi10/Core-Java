package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.softwareHub.SoftwareHub;
import java.util.Scanner;


public class AppExecuter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of apps to be added");
        int size = sc.nextInt();



        SoftwareHub software = new SoftwareHub(size);// its like play store and it is storing applications

        for (int index = 0; index < size; index++) {
            Application application = new Application();
            System.out.println("Enter the  app id");
            application.setAppId(sc.nextInt());
            System.out.println("Enter the app name");
            application.setAppName(sc.next());
            System.out.println("Enter the app size");
            application.setAppInSize(sc.nextDouble());
            System.out.println("Enter the release date");
            application.setReleaseDate(sc.next());
            System.out.println("Enter the  app owner name");
            application.setOwnerName(sc.next());
            System.out.println("Enter the app type");
            application.setAppType(sc.next());
            System.out.println("Enetr the app version");
            application.setAppVersion(sc.next());
            software.addApplications(application);
           // software.getApplicationsNames();
        }



        /////////////////////////////BY using DO WHILE AND SWITCH STATENENTS ////////////////////////
        String input = null;

        do {
            System.out.println("Inside Do while loop");
            System.out.println("Press 1: get all applications");
            System.out.println("Press 2: get all applications by name ");
            System.out.println("Press 3: get all applications by id");
            System.out.println("Press 4: get all applications by app type");
            System.out.println("Press 5: get all applications by date");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                   software.getApplicationsNames();
                    break;
                case 2:
                   Application app=software.getApplicationByName(sc.next());
                    System.out.println(app.getAppId()+app.getAppInSize()+app.getAppType()+app.getAppName());
                    break;
                case 3:
                   String ref3= software.getApplicationByItsId(sc.nextInt());
                    System.out.println("The application by giving id is"+ref3);

                    break;
                case 4:
                    String ref4[]=software.getApplicationByAppType(sc.next());
                    System.out.println("The application we got by app type is"+ref4);

                    break;
                case 5:
                    String ref5=software.getDateByAppName(sc.next());
                    System.out.println("The relese date that we got by Application name "+ref5);
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














/*
        Application application =new Application();
        application.setAppId(1);
        application.setAppName("Instagram");
        application.setAppInSize(32);
        application.setAppVersion("v5.43");
        application.setOwnerName("Meta");
        application.setAppType("Social");
        application.setReleaseDate("march 5 2013");

        software.addApplications(application);
        //2nd object

        Application application1=new Application();
        application1.setAppId(2);
        application1.setAppName("Zerodha");
        application1.setAppVersion("v2.1");
        application1.setAppInSize(78);
        application1.setAppType("Investment");
        application1.setReleaseDate("30-sept-2019");

        software.addApplications(application1);

        //3rd object

        Application application2=new Application();
        application2.setAppId(3);
        application2.setAppName("yono");
        application2.setAppVersion("1.0.1");
        application2.setAppInSize(11);
        application2.setAppType("Banking");
        application2.setReleaseDate("05 dec 2019");



        software.addApplications(application2);

        //4th object


            Application application3=new Application();
            application3.setAppId(4);
            application3.setAppName("Clash of Clans");
            application3.setAppVersion("v12.4");
            application3.setAppInSize(110.54);
            application3.setAppType("Games");
            application3.setReleaseDate("feb 21 2007");

            software.addApplications(application3);

            //5th object

            Application application4=new Application();
            application4.setAppId(5);
            application4.setAppName("Pes 2023");
            application4.setAppVersion("v3.5");
            application4.setAppInSize(12003.33);
            application4.setAppType("Sports");
            application4.setReleaseDate("March 19 2022");



            software.addApplications(application4);
           // software.getApplicationsNames();

///////// now we are searching appNames by some categories like by application  type from some changes

             Application app=software.getApplicationByName("Instagram");
             if(app!=null) {
                     System.out.println(app.getAppId() + " " + app.getAppName() + " " + app.getAppInSize() + " " + app.getAppVersion() + " " + app.getAppType() + " " + app.getReleaseDate());
             }
             else{
                     System.out.println("The App Name you are searching is not found");
             }

             Application app1=software.getApplicationByName("Whatsapp");
            if(app1!=null) {
                    System.out.println(app1.getAppId() + " " + app1.getAppName() + " " + app1.getAppInSize() + " " + app1.getAppVersion() + " " + app1.getAppType() + " " + app1.getReleaseDate());
            }
            else{
                    System.out.println("The App Name you are searching is not found");
            }
            Application app2=software.getApplicationByName("WeChat");
            if(app2!=null) {
                    System.out.println(app2.getAppId() + " " + app2.getAppName() + " " + app2.getAppInSize() + " " + app2.getAppVersion() + " " + app2.getAppType() + " " + app2.getReleaseDate());
            }
            else{
                    System.out.println("The App Name you are searching is not found");

            }
            ///////// other app seacrhingg  error
            Application app3=software.getApplicationByName("telegram");
            if(app3!=null) {
                    System.out.println(app3.getAppId() + " " + app3.getAppName() + " " + app3.getAppInSize() + " " + app3.getAppVersion() + " " + app3.getAppType() + " " + app3.getReleaseDate());
            }
            else{
                    System.out.println("The App Name you are searching is not found");
            }

///// getApplication by its id ////////////////////////////////////////////////////////////////////
           Application getappbyid=software.getApplicationByItsId(1);
            System.out.println(getappbyid.getAppName());

            Application getappbyid1=software.getApplicationByItsId(2);
            System.out.println(getappbyid1.getAppName());

            Application getappbyid2=software.getApplicationByItsId(5);
            System.out.println(getappbyid2.getAppName());

            Application getappbyid10=software.getApplicationByItsId(10);
            if(getappbyid10!=null) {
                    System.out.println(getappbyid10.getAppName());
            }
            else {
                    System.out.println("App not found");
            }

// get Application by app type (String appType)/////////////////////////////////////////////////////
            Application getappbyappType=software.getApplicationByAppType("Social");
            System.out.println(getappbyappType.getAppName());

            Application getappbyappType1=software.getApplicationByAppType("Games");
            System.out.println(getappbyappType1.getAppName());

            Application getappbyappType2=software.getApplicationByAppType("Shopping");
            if(getappbyappType2!=null){
                    System.out.println("The app is "+getappbyappType2.getAppName());
            }
                else {
                    System.out.println("The app Not found");

            }

///////////////////////////////Get application Name by application type//////////////////////////////////
            String getAppNameByapptype=software.getApplicationNameByType( "Sports");
            System.out.println("The Application Name you are searching is "+getAppNameByapptype);

//////////////////////////////get Application size  by Name /////////////////////////////////////////////
            double getAppNamebySize=software.getApplicationSizeByName("Pes 2023");
        System.out.println("The Application you were searching it is having size of "+ getAppNamebySize+"mb");

        double getAppNamebySize1=software.getApplicationSizeByName("Instagram");
        System.out.println("The Application you were searching it is having size of "+ getAppNamebySize1+"mb");

        double getAppNamebySize2=software.getApplicationSizeByName("Zerodha");
        System.out.println("The Application you were searching it is having size of "+ getAppNamebySize2+"mb");

        double getAppNamebySize3=software.getApplicationSizeByName("yono");
        System.out.println("The Application you were searching it is having size of "+ getAppNamebySize3+"mb");

        double getAppNamebySize4=software.getApplicationSizeByName("Clash of Clans");
        System.out.println("The Application you were searching it is having size of "+ getAppNamebySize4+"mb");

        double getAppNamebySize5=software.getApplicationSizeByName("Whatsapp");
        System.out.println("The Application you were searching it is having size of "+ getAppNamebySize5+"mb");

        //////////////////////////////   Get release date by appname        //////////////////////////////////

        String getDateByAppname=software.getDateByAppName("Pes 2023");
        System.out.println("The App is released on "+getDateByAppname);

        String getDateByAppname1=software.getDateByAppName("yono");
        System.out.println("The App is released on"+getDateByAppname1);


        /////////////////////////////////// update appversion by appname//////////////////////////

        software.getApplicationsNames();;

        software.updateVersionByAppName("Pes 2023","2.1.1 v");

        software.updateAppByDetails("Instagram","30 july 2001","Business ",324234);

        software.getApplicationsNames();



//////////////////////////////////////// deleting the data by using 2 arrays and 2 for loo[s ///////////
        // software.deleteAppbyAppName("TikTok");
/////////////////////////////////////////////// deleting the array by copy of functions
        software.deleteIndex("Instagram");
        */




