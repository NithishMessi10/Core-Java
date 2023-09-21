class Passport{
	String passportOffice;
	String givenName;
	String surname;
	String dob;
	String emailid;
	String loginid;
	String password;
	String confirmPassword;
	
	public Passport(String PassportOff,String GivenName,String surname,String dob,String emailid,String loginid,
	String password,String confirmPassword)
{
		System.out.println("The Constructor is created and invoked by me");
		PassportOffice=PassportOff;
		GivenName=gvname;
		Surname=sname;
		System.out.println(PassportOffice+"	"+GivenName+"	"+Surname);
		
		
	}
	

	public boolean verifyPassword(String Password,String ConfirmPassword){
		
		
		boolean isverifypassword=false;
		if(Password.length() >6 && Password.length() < 16){
		if(Password==ConfirmPassword){
			System.out.println("The Password is Matched and You may proceed");
			isverifypassword=true;
			displayuserdetails();
			
		}else{
			System.out.println("The given password is error please check and verify again");
		}
		}
		else{
			System.out.println("the code length is not in the bounds");
		}
		return isverifypassword;
	}
		
	
	public void displayuserdetails(){
		System.out.println("The Given Passport office is"+PassportOffice);
		System.out.println("The Given name is "+GivenName);
		System.out.println("The Given Surname is"+Surname);
		System.out.println("The Given Date of Birth is "+DOB);
		System.out.println("The Given Email id is "+Emailid);
		System.out.println("The Given Login Id is"+Loginid);
		
	}
	
	
	
	
