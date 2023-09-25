class HardwareExecutor{

	public static void main(String args []){
		Hardware age = new Hardware();
		age.setTool("Hardware");
		age.setName("KeyBoard");
		age.setPrice(1500);
		
		
		
		
		Software ref = new Software();
		ref.hardware = age;
		
		
		
			System.out.println(ref.hardware.getTool());
				System.out.println(ref.hardware.getName());
				System.out.println(ref.hardware.getPrice());
				
		
	}



}