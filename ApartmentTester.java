class ApartmentTester{
	
	public static void main(String args[]){
	
	// creating multiple copy of class/object;
	// class name  ref = 	new classname()
	   Apartments apartment = new Apartments();
		apartment.apartmentId=3;
		apartment.apartmentName="prestige";  //. operator used to access variables 
		apartment.apartmentFloors=45;
		apartment.apartmentPrice=16500000;
		apartment.noofonebhkflats=90;
		apartment.nooftwobhkflats=100;
		apartment.noofthreedbhkflats=80;
		
		apartment.provideHouses();
		
		System.out.println("the apartment id is "+apartment.apartmentId);
		System.out.println("the apartment name is "+apartment.apartmentName);
		System.out.println("the apartment floors having is "+apartment.apartmentFloors);
		System.out.println("the apartment price having for flats "+apartment.apartmentPrice);
		System.out.println("the apartment having one bhk flats "+apartment.noofonebhkflats);
		System.out.println("the apartment having two bhk flats "+apartment.nooftwobhkflats);
		System.out.println("the apartment having three bhk flats is "+apartment.noofthreedbhkflats);

	}
}