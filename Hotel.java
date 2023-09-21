class Hotel{
  
  String menuNames[] = new String[11];
  int index;
  
  public boolean addFoodName(String foodName){
	  System.out.println("Inside addFoodName()");
  
  boolean isAdded = false;
  if(index<menuNames.length){
  if(foodName!=null){
	  boolean isfoodNameExists = checkExistFoodName(foodName);
  if(isfoodNameExists==false){
	  System.out.println("validation is proper..proceed to add foodName");
  
  menuNames[index]=foodName;
  index++;
  isAdded=true;
  System.out.println(foodName +  " is added sucessfully  ");
  
  
  }
  else{
	  
	  System.out.println(foodName + "  is already exists");
  }
  }}else{
	  
	  System.out.println("Space is full cannot add data");
}
  
  return isAdded;
  
  }
  public void getMenu(){
  
  for(int index=0;index<menuNames.length;index++){
  System.out.println(menuNames[index]);
  
  }
  }
  public boolean checkExistFoodName(String foodName){
	  
	boolean   isfoodNameExists = false;
	  for(int index=0;index<menuNames.length;index++){
		  if(menuNames[index]==foodName){
			  isfoodNameExists = true;
		  }
	  }
	return isfoodNameExists;
  }

}