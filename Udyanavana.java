class Udyanavana{
	
	String flowers[];
	String name;
	int noOfGates;
	String openingTime;
	String closingTime;
	String rareAnimals;
	
	public Udyanavana(){
		this("Lalbagh",3,"6AM","6PM","Peacock");
		System.out.println("Default constructor");
	}
	
	
	public Udyanavana(String flowers[],String name,int noOfGates,String openingTime,String closingTime,String rareAnimals){
		
		this.flowers=flowers;
		this.name=name;
		this.noOfGates=noOfGates;
		this.openingTime=openingTime;
		this.closingTime=closingTime;
		this.rareAnimals=rareAnimals;
		getFlowers();
		getDisplayDetails();
		
	}
	
public void getFlowers(){
	for(int index=0;index<flowers.length;index++)
		System.out.print(flowers
	[index]);
}
public void getDisplayDetails(){
System.out.println(name+"	"+noOfGates+" "+openingTime+"	"+closingTime+"	"+rareAnimals);
}
}