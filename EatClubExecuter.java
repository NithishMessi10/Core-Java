class EatClubExecuter{
	public static void main(String args[]){
		double cost=0.0;
		String foodName = "vegbiriyani"
		price=EatClub.Favorites("veg",foodName);
		System.out.println("the dish you have ordered is "+foodName+""+cost);
		price=EatClub.Favorites("veg","vegfriedrice");
		System.out.println("the dish you have ordered is veg fried rice"+cost);
		price=EatClub.Favorites("veg","veghyderabadi");
		System.out.println("the dish you have ordered is veg hyderabadi"+cost);
		price=EatClub.Favorites("veg","dalkichdi");
		System.out.println("the dish you have ordered is dal kichdi"+cost);
		price=EatClub.Favorites("veg","dalmakhni");
		System.out.println("the dish you have ordered is dal makhni"+cost);
		price=EatClub.Favorites("veg","kharakichdi");
		System.out.println("the dish you have ordered is veg biriyani"+cost);
		price=EatClub.Favorites("vegultra","vegbiriyani");// another parameter
		System.out.println("invalid search"+cost);
		price=EatClub.Favorites("nonveg","chickenbiriyani");
		System.out.println("the dish you have ordered is chicken biriyani"+cost);
		price=EatClub.Favorites("nonveg","amboorbiriyani");
		System.out.println("the dish you have ordered is amboor biriyani"+cost);
		price=EatClub.Favorites("nonveg","amboordumbiriyani");
		System.out.println("the dish you have ordered is amboor dum biriyani"+cost);
		price=EatClub.Favorites("nonveg","muttonbiriyani");
		System.out.println("the dish you have ordered is mutton biriyani"+cost);
		price=EatClub.Favorites("nonveg","muttonpiecebiriyani");
		System.out.println("the dish you have ordered is mutton piece biriyani biriyani"+cost);
		price=EatClub.Favorites("nonveg","chickpetedumbiriyani");
		System.out.println("the dish you have ordered is chickpete dum biriyani"+cost);
		price=EatClub.Favorites("nonvegultra","chickenbiriyani"); // another parametrer
		System.out.println("invalid search"+cost);
	}
}