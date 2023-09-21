class Railway{
	String trainNames[]=new String[10];
	int index;
	
	public boolean addTrainName(String trainName){
		boolean isAdded=false;
		if(index<trainNames.length){
		if(trainName!=null){
			boolean isExists=existsTrainName(trainName);
			if(isExists==false){
		   trainNames[index]=trainName;
		   index++;
			isAdded=true;
		}
		else{System.out.println("train name already exists");}
		}
		else{System.out.println("null values are printed");}
			}
			else{System.out.println("not in bounds");}
	return isAdded;

	}
		
	public void getTrainName(){
		for(int index=0;index<trainNames.length;index++)
			System.out.println(trainNames[index]);
	}
	
	public boolean existsTrainName(String trainName){
	boolean	isExists=false;
		for(int index=0;index<trainNames.length;index++){
			trainNames[index]=trainName;
			isExists=true;
		}
		return isExists;
	}
}