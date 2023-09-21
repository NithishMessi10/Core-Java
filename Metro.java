class Metro{
	
	 int metroId;
	 int noOfCompartments;
	 String source;
	 String  destination;

 public Metro(int metroId,int nocomp,String src,String dest){
	 this.metroId=metroId; // if we use this then the value is printed reffered to instance variable or else null 
	 //values are printed
	 noOfCompartments=nocomp;
	 source=src;
	 destination=dest;
	 
	 
 }	
 public  void displayDetails(){
	 System.out.println(metroId+" "+noOfCompartments+" "+source+" "+destination);
 }
}
