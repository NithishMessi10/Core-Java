class CricketTeam{
String playerNames[] = new String[11];
int i;
public boolean addPlayerName(String playerName){
	boolean isPlayerAdded = false;
	if(i<playerNames.length){
	if(playerName!=null){
		boolean isExists = checkExistsPlayerName(playerName);
		if(isExists==false){
		
		System.out.println("validation is proper..proceed to add playerName");
		playerNames[i++] = playerName;
		isPlayerAdded = true;
		System.out.println(playerName + " added");
	}
	else{
		System.out.println(playerName +" already exists");
	}
	}}else{
		System.out.println("Space is full cannot add data");
	}
	
	
	return isPlayerAdded;
}


public void getPlayerNames(){
			
	for(int i=0;i<playerNames.length;i++){
		
		System.out.println(playerNames[i]);
	}
	
}
public boolean checkExistsPlayerName(String playerName){
	
	boolean isExists = false;
	for(int i=0;i<playerNames.length;i++){
		if(playerNames[i]==playerName){
			isExists = true;
		}
	}
	return isExists;
}


}