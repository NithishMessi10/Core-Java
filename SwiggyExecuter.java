class SwiggyExecuter{
	
	public static void main(String args[]){
		double price=0.0;
		double pricewithquantity=0.0;
		pricewithquantity=Swiggy.search("pizza",3);
		System.out.println("the price of the pizza is "+pricewithquantity);

			}
}