class MessiStores{
	
	int id;
	int noOfEmployees;
	String sections;
	String Locations;
	String Brands[];
	
	public MessiStores(int ide,int cntemp,String sect,String loc,String Bnds[]){
		System.out.println("The Constructor is created by me and Messi and btw he is the goat");
		id=ide;
		noOfEmployees=cntemp;
		sections=sect;
		Locations=loc;
		Brands=Bnds;
		System.out.println(noOfEmployees+" "+sections+" "+Locations+"	"+Brands[]);
		
	}
	
	/*public void openingShowroom(){
		System.out.println("Opens at 11 A.M");
	}
	public void doingBussiness(){
		System.out.println("Messi Signed Jersey is Available");
	}*/
	
	public void sellingBrands(String array[]){
		for(int index=0;index<array.length;index++){
			System.out.println(array[index]);
		}
		
	}
	
}