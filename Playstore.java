class Playstore{
	
	static String Games[]={"subwaysurfers","asphalt8","ninja","templerun","drdriving","pes2022","fifa22","gta5","gta4","pubg","cod"};
	static int GamesPrice[]={100,99,1121,23,432,44,55,66,7,88,99};
	
	public static void main(String args[])
	{
		for(int GamesIndex=0; GamesIndex < Games.length ; GamesIndex++)
		{
			for(int GamesPriceIndex=0; GamesPriceIndex < GamesPrice.length ; GamesPriceIndex++){
				if(GamesIndex==GamesPriceIndex){
				System.out.println("The Games are " +"    " +Games[GamesIndex]+"The price is"+ "   "+ GamesPrice[GamesPriceIndex]);
			}
			}
		}			
	}
	
}