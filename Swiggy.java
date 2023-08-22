class Swiggy{
	public static double search(String foodname){
		double price=0.0;
		if(foodname=="pizza"){
			price=110.00;
			return price;
		}
		if(foodname=="jeerarice"){
			price=190.00;
			return price;
		}
		if(foodname=="vegbiriyani"){
			price=200.00;
			return price;
		}
		return price;
	}
	public static double search(String foodname,int quantity){ // method overloading concept using same method but different parameters
		double price=0.0;
		if(foodname=="pizza"){
			price=110.00*quantity;
			return price;
		}
		if(foodname=="jeerarice"){
			price=190.00*quantity;
			return price;
		}
		if(foodname=="vegbiriyani"){
			price=200.00*quantity;
			return price;
		}
		return price;
	}
}