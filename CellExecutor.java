class CellExecutor{

	public static void main(String args []){
	 Cell energy = new Cell();
	  energy.setCompany("Battery Festivel");
	  energy.setBrand("sgsagsgs");
	  energy.setPrice(1200);
	  energy.setUsed("ninga bekadu");
	  
	  
	  
	  
	  Watch a = new Watch();
	   a.cell = energy;
	  
	  System.out.println( a.cell.getCompany());
	    
	  System.out.println( a.cell.getBrand());
	    
	  System.out.println( a.cell.getPrice());
	   
	  System.out.println( a.cell.getUsed());
	  
	  
	  
	
	}

}