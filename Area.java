class Area{
	static String AreaName[]={"k.r puram","vinobha nagar","r t nagar","rml nagar","gandhi bazar","sagar road","qdqwd","qdwjqwdqwd","qdjqwjed"};
	static int AreaNo[]={21,26,77,31,54,91,11};
	
	
	public static void main(String args[]){
		for(int index1=0;index1<AreaName.length;index1++){
			for(int index2=0;index2<AreaNo.length;index2++){
				if(index1==index2){
				System.out.println(AreaName[index1]+ "------->"+AreaNo[index2]);
				}
			}
			
		}
		
		
		
	}
}