class Example{
	
	static int array[]={77,22,21,44,36};
	public static void main(String args[]){
		getAscending(array);
	}
	
	
	public static void getAscending(int array[]){
		int temp=0;
		for(int index=0;index<array.length;index++){
			for(int anotherIndex=index+1;anotherIndex<array.length;anotherIndex++)
				if(array[index]>array[anotherIndex]){
				temp=array[index];
				array[index]=array[anotherIndex];
				array[anotherIndex]=temp;
				}
				System.out.println(array[index]);   /////////////////   Ascending or desecending methods to sort
		} 
	}
}