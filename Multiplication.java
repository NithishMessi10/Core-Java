class Multiplication{
	public static void main(String args[]){
		
		long total= 74*22;
		long total1=65*11;
		long total2=43*34;
		long total3=334*234;
		long total4=245*345;
		long total5=345*656;
		long total6=345*123;
		long total7=234*645;
		long total8=24*653;
		long total9=2334*5643;
		
		System.out.println("--------------- by using sop ------------");
		System.out.println("the product  of 2 numbers is "+total);
		System.out.println("the product  of 2 numbers is "+total1);
		System.out.println("the product  of 2 numbers is "+total2);
		System.out.println("the product  of 2 numbers is "+total3);
		System.out.println("the product  of 2 numbers is "+total4);
		System.out.println("the product  of 2 numbers is "+total5);
		System.out.println("the product  of 2 numbers is "+total6);
		System.out.println("the product  of 2 numbers is "+total7);
		System.out.println("the product  of 2 numbers is "+total8);
		System.out.println("the product  of 2 numbers is "+total9);

		System.out.println("--------------- by using methods ------------");		
		mul(74,22);
		mul(65,11);
		mul(43,34);
		mul(334,234);
		mul(245,345);
		mul(345,656);
		mul(345,123);
		mul(234,645);
		mul(24,653);
		mul(2334,5643);
		
		
	}
	public static void mul(long a,long b){
		System.out.println("the product of 2 numbers by using methods are"+"  "+(a*b));
	}
}