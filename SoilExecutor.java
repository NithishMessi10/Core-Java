class SoilExecutor{

public static void main(String args[]){
	Soil ref = new Soil();
	ref.setName();
	ref.setType();
	
	
	
	
	Plant plant = new Plant();
	plant.mannu = ref;
	
	
	System.out.println(plant.mannu.getName());
	System.out.println(plant.mannu.getType());
	
}

}