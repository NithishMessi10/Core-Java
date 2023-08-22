class Netflix{
static String kannadaMovies[]={"Googly","jogi","kgf","kgf2","ram"};
static String englishMovies[]={"peaky Blinders","oppenheimer","fast and furious","fast and furious3","fast and furious tokyo drift"};
static String hindiSeries[]={"asur","yeh jawani hai deewani","mirzapur","aarya","tandav"};
static String teluguMovies[]={"agent","jawan","rudrangi","v","dejavu"};
static String MalayalamMovies[]={"hridayam","vikram","holidays","neymar","malik"};

public static void printMyMovies(String array[]){
	
	for(int index=0;index<array.length;index++){
		System.out.println("The Movies are"+array[index]);
	}
}

public static void main(String args[]){
	printMyMovies(kannadaMovies);
	printMyMovies(englishMovies);
	printMyMovies(hindiSeries);
	printMyMovies(teluguMovies);
	printMyMovies(MalayalamMovies);
}
}