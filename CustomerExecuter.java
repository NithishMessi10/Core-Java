class CustomerExecuter{
	public static void main(String args[]){
		
		
		Customer customer=new Customer();
		customer.setCustomerId(1);
		
		System.out.println("The customer Id is "+customer.getCustomerId());
		
		customer.setCustomerName("Nithish");
		customer.setAdress("k.r puram");
		customer.setContactNo(9844183371l);
		customer.setEmail("email@gmail.com");
		customer.setDob("30-07-2001");
		customer.setGender("male");
		customer.displayDetails();
		
		
	}
}