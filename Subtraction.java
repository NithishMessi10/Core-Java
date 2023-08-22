class Subtraction{
	public static void main(String args[]){
		int total= 74-22;
		int total1=65-11;
		int total2=43-34;
		int total3=334-234;
		int total4=245-345;
		int total5=345-656;
		int total6=345-123;
		int total7=234-645;
		int total8=24-653;
		int total9=2334-5643;
		
		System.out.println("--------------- by using sop ------------");
		System.out.println("the difference of 2 numbers is "+total);
		System.out.println("the difference of 2 numbers is "+total1);
		System.out.println("the difference of 2 numbers is "+total2);
		System.out.println("the difference of 2 numbers is "+total3);
		System.out.println("the difference of 2 numbers is "+total4);
		System.out.println("the difference of 2 numbers is "+total5);
		System.out.println("the difference of 2 numbers is "+total6);
		System.out.println("the difference of 2 numbers is "+total7);
		System.out.println("the difference of 2 numbers is "+total8);
		System.out.println("the difference of 2 numbers is "+total9);
		
		System.out.println("--------------- by using methods ------------");
		Subtraction.sub(1,2,3);
		/*sub(65,11);
		sub(43,34);
		sub(334,234);
	    sub(245,345);
		sub(345,656);
		sub(345,123);
		sub(234,645);
		sub(24,653);
		sub(2334,5643);*/
	}
	
	public void sub(int a,int b,int c){
		System.out.println("the difference of 2 numbers by using methods is"+ (a-b-c));
	}
	
	
	
	
	
	
	
}