class MessiStoresExecuter{
	
	public static void main (String args[]){
		
		String shoes[]={"addidas","Nike","puma","ravi"};
		String shoes1[]={"nuke","money","lava","gucci"};
		
		MessiStores process=new MessiStores(1,5,"3","ubcity",shoes);
		System.out.println("-----------------------");
		//MessiStores process1=new MessiStores(2,10,"6","jayanagar",shoes1);
		process.sellingBrands(process.shoes);
	//	process1.sellingBrands(process1.Brands1);
		/*process.id=1;
		process.noOfEmployees=5;
		process.sections="3";
		process.Locations="Ub city";
		process.Brands=Brands;
		*/
		
		//System.out.println(process.id+" "+process.noOfEmployees+"	"+process.sections);
		
		//process.openingShowroom();
		//process.doingBussiness();
		//process.sellingBrands(process.Brands);
		
		
		
		
		
		
		
	}
}