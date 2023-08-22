class EatClub{
	public static double Favorites(String Foodtype,String Foodname){
		double cost=0.0;
		if(Foodtype=="veg"){
			if(Foodname=="vegbiriyani"){
				cost=200.00;
				return cost;
			}
			if(Foodname=="vegfriedrice"){
				cost=150.00;
				return cost;
			}
			if(Foodname=="veghyderabadi"){
				cost=250.00;
				return cost;
			}
			if(Foodname=="dalkichdi"){
				cost=290.00;
				return cost;
			}
			if(Foodname=="dalmakhni"){
				cost=199.00;
				return cost;
			}
			if(Foodname=="kharakichdi"){
				cost=300.00;
				return cost;
			}
		}
		else if(Foodtype=="nonveg"){
			if(foodname=="chickenbiriyani"){
				cost=299.99;
				return cost;
			}
			if(foodname=="amboorbiriyani"){
				cost=310.99;
				return cost;
			}
			if(foodname=="amboordumbiriyani"){
				cost=330.99;
				return cost;
			}
			if(foodname=="muttonbiriyani"){
				cost=330.99;
				return cost;
			}
			if(foodname=="muttonpiecebiriyani"){
				cost=350.99;
				return cost;
			}
			if(foodname=="chickpetedumbiriyani"){
				cost=400.99;
				return cost;
			}
		}
		return cost;
		
	}