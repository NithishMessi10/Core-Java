class PassengersExecutor{



public static void main(String args[]){
	 Passengers ref  = new Passengers();
	 ref.setName("Channammma Exepress");
	 ref.setOwner("RBI");
	 ref.setPlace("Bangalore");
	 ref.setNoOfPassengers(1200);
	 
	 
	 
		Train go = new Train();
		go.variable = ref;
		
		System.out.println(go.variable.getName());
		System.out.println(go.variable.getOwner());
		System.out.println(go.variable.getPlace());
		System.out.println(go.variable.getNoOfPassengers());
		
		
}


}