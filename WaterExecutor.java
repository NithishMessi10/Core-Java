class WaterExecutor{
public static void main(String args []){

 Water water = new Water();
  water.setColor("Blue");
  water.setPrice(2000);
  water.setDensity("density is 1.00");
  
  
  Fish fish = new Fish();
  fish.water = water;
  
  
  System.out.println(fish.water.getColor());
  System.out.println(fish.water.getPrice());
  System.out.println(fish.water.getDensity());
 
  


}
}