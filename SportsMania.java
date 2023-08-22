class SportsMania{
	static String top10footballPlayers[]={"messi","ronaldo","neymar","maldini","rummenigge"};
	static int top10jerseyNumbers[]={10,7,19,21,30,22,8,9,11,12,13,14,15};
	static char favPlayer[]={'M','E','S','S','I'};
	static long playersPhoneNum[]={923237234,234914723,238223892,234823482,238248239,24829219};
	
	public static void iwantPlayersList(String array[]){
	
	for(int index=0;index<array.length;index++){
		System.out.println("The Movies are"+array[index]);
	}

}
public static void iwantPlayersList(int array[]){
	
	for(int index=0;index<array.length;index++){
		System.out.println("The Movies are"+array[index]);
	}
}
public static void iwantPlayersList(char array[]){
	
	for(int index=0;index<array.length;index++){
		System.out.println("The Movies are"+array[index]);
	}
}
public static void iwantPlayersList(long array[]){
	
	for(int index=0;index<array.length;index++){
		System.out.println("The Movies are"+array[index]);
	}
}

public static void main(String args[]){
	iwantPlayersList(top10footballPlayers);
	iwantPlayersList(top10jerseyNumbers);
	iwantPlayersList(favPlayer);
	iwantPlayersList(playersPhoneNum);
}
}
	