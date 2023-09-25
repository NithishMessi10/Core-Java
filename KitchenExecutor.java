class KitchenExecutor{

public static void main(String  args[]){
	
	
	Kitchen kitchen = new Kitchen();
	kitchen.setName("Super Kitchen");
	kitchen.setLocation("Vijayanagr");
	kitchen.setOwner("Siddu");
	
	
	  Hotel kelasa = new Hotel();
	  kelasa.kitchen = kitchen;
	  
	  System.out.println(kelasa.kitchen.getName());
	  System.out.println(kelasa.kitchen.getLocation());
	  System.out.println(kelasa.kitchen.getOwner());
	
}


}















