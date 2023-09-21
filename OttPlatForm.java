class OttPlatForm{

	/*public void getMovies(String kannadaMovie, String englishMovie, String hindiMovie){
		System.out.println("Movies...............");
		System.out.println("kannadaMovie" +"------"+ kannadaMovie);
		System.out.println("englishMovie" + "----"+englishMovie);
		System.out.println("hindiMovie" + "--"+hindiMovie);
		System.out.println("End Movies.....................");
	*/ 
	String movieNames[]=new String[4]; //it will record the no of data to be stored to the String variable
	int index;
	public  boolean  addMovieName(String MovieName){  // now it is read operation if we want to know whether our data is stored or not then we use boolean 
		   boolean isAdded=false;
		  
		   if(index<MovieNames.length){


    			   // checking index length

checkSameMovie()				   
		                                // check if the data already exists unique or duplicate
			if(MovieName != null){      // movie name whether is null or not 
				MovieNames[index]=MovieName;
				index++;
				isAdded=true;
			}
			
	
	}
	return isAdded;
	}
	
	public void getMovieName(){
		for(int index=0;index<MovieNames.length;index++)
			System.out.println(MovieNames[index]);
	}
	
	public void checkSameMovie(String movieName){
		boolean exists = false;
		for(int index=0;index<MovieNames.length;index++){
		
					//        0    
				if(MovieNames[index]==movieName){
					System.out.println("duplicate data is added");
					exists = true;
					
				}
				i
				
		}
	}
}