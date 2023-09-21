class TransportExecuter{
	
	public static void main(String args[]){
		String transport[]={"airways","seaways","landways","railways"};
		String transport1[]={"train","bus","lari","cab","auto"};
		
		Transport tran=new Transport(transport,"1.25 Billion","guns","No pipelines","couriers");
		System.out.println("-----------------------------------------------------------------");
		Transport tran1=new Transport(transport1,"2 billion","oils","petrol pipelines","goods");
		System.out.println("-----------------------------------------------------------------");
		Transport tran2=new Transport(transport,"3 billion","rubber","fuel pipelines","posts");
		System.out.println("-----------------------------------------------------------------");
		Transport tran3=new Transport(transport1,"4 billion","spices","gas pipelines","chips");
		System.out.println("-----------------------------------------------------------------");
		Transport tran4=new Transport(transport,"5 billion","liquids","nitrogen pipelines","cars");
		System.out.println("-----------------------------------------------------------------");
		
		
		
	}
}