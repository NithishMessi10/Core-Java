class SimExecutor{

	public static void main(String args []){
		
		Sim ref = new Sim();
		ref.setOwner("Ambhani");
		ref.setName("Jio");
		
		
		
		
		CellPhone ref1 = new CellPhone();
			ref1.sim = ref;
			
			
			System.out.println(ref1.sim.getOwner());
			System.out.println(ref1.sim.getName());
		
		
	}


}