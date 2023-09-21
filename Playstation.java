class Playstation{

  int id;
  int noOfControllers;
  int noOfGames;
  String gamesName;
  String genreOfGames;
  
    public Playstation( int id , int noOfControllers , int noOfGames , String gamesName , String genreOfGames){
		
		id = id;
		noOfControllers = noOfControllers;
		noOfGames = noOfGames;
		gamesName = gamesName;
		genreOfGames = genreOfGames;
		//displayDetails();
		 System.out.println("PlayStation Id Is:  " + id);
	   System.out.println("PlayStation no of controllers:  " + noOfControllers);
	   System.out.println("PlayStation Total no of games:  " + noOfGames);
	   System.out.println("PlayStation games name are:  " + gamesName);
	   System.out.println("PlayStation Place Is:  " + genreOfGames);
	                                                                                                                          }

  /* public void displayDetails(){
	   
	   System.out.println("PlayStation Id Is:  " + id);
	   System.out.println("PlayStation no of controllers:  " + noOfControllers);
	   System.out.println("PlayStation Total no of games:  " + noOfGames);
	   System.out.println("PlayStation games name are:  " + gamesName);
	   System.out.println("PlayStation Place Is:  " + genreOfGames);
	   
   }*/
}