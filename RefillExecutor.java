class RefillExecutor{

public static void main(String args []){
	Refill ref = new Refill();
	ref.setName("Nataraja");
	ref.setPrice(10);
	
	
	
	Pen ref1 = new Pen();
	ref1.refill = ref;
	
	
	System.out.println(ref1.refill.getName());
	
	System.out.println(ref1.refill.getPrice());
}

}