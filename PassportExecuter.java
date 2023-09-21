class PassportExecuter{
	public static void main(String args[]){
		
		Passport passport=new Passport("Bengaluru","Nithish","s");
		Passport passport1=new Passport("Mysore","amith","ks");
		passport.GivenName="Nithish";
		passport.Surname="S";
		passport.DOB="30-07-2001";
		passport.Emailid="nithishsk@gmail.com";
		passport.Loginid="nsk10";
		passport.Password="123412341234";
		passport.ConfirmPassword="123412341234";
		passport.verifyPassword(passport.Password,passport.ConfirmPassword);
	}
}