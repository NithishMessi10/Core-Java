class Customer{
	// instance variables with private access 
	private int customerId;
	private String customerName;
	private String address;
	private long contactNo;
	private String email;
	private String dob;
	private String gender;
	//customerId
	public void setCustomerId(int customerId){  //setter method 
		this.customerId=customerId;
		}
	public int getCustomerId(){                 //getter method 
		return customerId;
	}
	//customerName
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public String getCustomerName(){
		return customerName;
	}
    //adress

	public void setAdress(String address){
		this.address=address;
	}
	public String getAdress(){
		return address;
	}
	// contactNo
	public void setContactNo(long contactNo){
		this.contactNo=contactNo;
	}
	public long getContactNo(){
		return contactNo;
	}
	//email
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	//dob 
	public void setDob(String dob){
		this.dob=dob;
	}
	public String getDob(){
		return dob;
	}
	//gender 
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	
		public void displayDetails(){
		System.out.println("the customer name is"+ customerName);
		System.out.println("the customer adress is"+address);
		System.out.println("the customer ph no is "+contactNo);
		System.out.println("the customer email is "+email);
		System.out.println("the date of birth is"+dob);
		System.out.println("the gender is "+gender);
		
	}
	
	
	
	
	
	
	
	
	
	
}