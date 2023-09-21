class ChatShop{

String chatNames[]= new String[11];
int index;
public boolean addChatName(String chatName){
 System.out.println("inside addChatName()");
 
 boolean isAdded = false;
 if(index<chatNames.length){
 if(chatName != null){
	 boolean isExists = existsChatName( chatName);
	if(isExists==false){
	
	System.out.println("validation is proper..proceed to add chat");
	chatNames[index] = chatName;
	index++;
	isAdded = true;
	System.out.println(chatName +  " is added sucessfully  ");
 }
 
 else{
	 
	 System.out.println(chatName  + " is already exists");
 }
 }else{
	 System.out.println("no space to add chats");
 }
 }
return isAdded;
}
public void getChatNames(){
	System.out.println("The chatName lists are");
	for(int index=0;index<chatNames.length;index++){
		
		System.out.println(chatNames[index]);
	}
}
public boolean existsChatName(String chatName){
	
	boolean isExists = false;
	for(int index=0;index<chatNames.length;index++){
		
		if(chatNames[index]==chatName)
			isExists=true;
	}
	return isExists;
}



}