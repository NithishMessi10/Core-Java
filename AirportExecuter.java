class AirportExecuter{
	public static void main(String args[]){
		Airport airo=new Airport(1,"Kempegowda International Airport","Banglore",400,20,15);
		airo.displayDetails();
		System.out.println("------------------------------------------------------------");
		Airport airo1=new Airport(2,"Indira Gandhi International Airport","Delhi",500,25,20);
		airo1.displayDetails();
		System.out.println("------------------------------------------------------------");
		Airport airo2=new Airport(3,"Dubai International Airport","Dubai",600,30,25);
		airo2.displayDetails();
		System.out.println("------------------------------------------------------------");
		Airport airo3=new Airport(4,"John Kennedy International Airport ","America",300,10,10);
		airo3.displayDetails();
		System.out.println("------------------------------------------------------------");
		Airport airo4=new Airport(5,"Mao Zedong International Airport","China",900,30,15);
		airo4.displayDetails();
		System.out.println("------------------------------------------------------------");
		
	}
}