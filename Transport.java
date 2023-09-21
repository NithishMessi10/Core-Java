class Transport{
	String modeOfTheTransport[];
	String dailyPassengersTravelled;
	String imports;
	String pipelines;
	String logistics;
	
	public Transport(String mot[],String dailyPassengersTravelled,String imports,String pipelines,String logistics){
		
		
		 modeOfTheTransport= mot;
	this.dailyPassengersTravelled= dailyPassengersTravelled;
	 this.imports=imports;
	this.pipelines= pipelines;
	 this.logistics=logistics;
	 //System.out.println(modeOfTheTransport[0]);
	getModes(modeOfTheTransport);
	getDisplayDetails();
	

	}
public void getModes(String array[]){
	for(int index=0;index<array.length;index++)
		System.out.print(array[index]);
}
public void getDisplayDetails(){
System.out.println(dailyPassengersTravelled+" "+dailyPassengersTravelled+"	"+imports+"	"+pipelines+"	"+logistics);
}
	
	
	
	
	
	
}
