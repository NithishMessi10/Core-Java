class Spotify{

String songNames[] = new String[11];
int index;
public boolean addSongName(String songName){
	boolean isSongAdded = false;
	if(index<songNames.length){
	
	if(songName!=null){
		 boolean isSongExists = checkSongIsExists(songName); 
		if(isSongExists==false){
System.out.println("validation is proper..proceed to add songName");
		songNames[index] = songName;
		index++;
		isSongAdded = true;
		System.out.println(songName + " is added");
	}else{
		System.out.println(songName + " is already exist");
	}
	}
	}else{
		
		System.out.println("Space is full cannot add data");
	}
	
	return isSongAdded;
}

public void getSongNames(){
	
	for(int index=0;index<songNames.length;index++){
		
		System.out.println(songNames[index]);
	}
	
}
public boolean checkSongIsExists(String songName){
	
	boolean isSongExists = false;
	for(int index=0;index<songNames.length;index++){
		if(songNames[index]==songName){
			isSongExists = true;
		}
	}
	return isSongExists;
}





}