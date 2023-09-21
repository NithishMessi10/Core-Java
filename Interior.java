class Interior{

String materialNames[] = new String[10];
int index;
public boolean addMaterialName(String materialName){
	boolean isMaterialAdded = false;
	if(index<materialNames.length){
	if(materialName!=null){
		boolean isMaterialExists = checkMaterialExists(materialName);
		if(isMaterialExists==false){
System.out.println("validation is proper..proceed to add materialName");
		
		materialNames[index] = materialName;
		index++;
		isMaterialAdded = true;
		System.out.println(materialName  + " is added");
	}
	else{
		System.out.println(materialName  + " is already exists ");
	}
	}
	}else{
		System.out.println("Space is full cannot add data");
	}
	
	
	return isMaterialAdded;
}

public void getMaterialNames(){
	
	for(int index=0;index<materialNames.length;index++){
		
		System.out.println(materialNames[index]);
	}
	
}
public boolean checkMaterialExists(String materialName){
	
	boolean isMaterialExists = false;
	for(int index=0;index<materialNames.length;index++){
		if(materialNames[index]==materialName){
			isMaterialExists = true;
		}
	}
	return isMaterialExists;
}






}