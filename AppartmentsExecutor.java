class AppartmentsExecutor{
 public static void main(String args []){
	
	 Flats hi = new Flats();
	 hi.setName("Shobha");
	 hi.setId(1);
	 
	 
	 
	 Appartments ref  = new Appartments();
	 ref.villa = hi;
	 
	 
	 System.out.println(ref.villa.getName());
	 System.out.println(ref.villa.getId());
 }

}