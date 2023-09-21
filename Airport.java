class Airport{
int id;
String airportName;
String location;
int noOfEmployes;
int securityCheckPosts;
int terminals;

public Airport(int id,String airportName,String location,int noOfEmployes,int securityCheckPosts,int terminals){
	this.id=id;
	this.airportName=airportName;
	this.location=location;
	this.noOfEmployes=noOfEmployes;
	this.securityCheckPosts=securityCheckPosts;
	this.terminals=terminals;
	
}

public void displayDetails(){
	System.out.println("The Id of the airport "+id);
	System.out.println("The Airport Name "+airportName);
	System.out.println("The Location of the airport is "+location);
	System.out.println("The no of employees are working are "+noOfEmployes);
	System.out.println("The total security check posts are "+securityCheckPosts);
	System.out.println("The total terminals present in airport is"+terminals);
}
}