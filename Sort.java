class Sort{
	
	public static void main(String args[]){
		
		int array[]={21,78,1,89,62,100};
		for(int index=0;index <array.length;index++){     // look for  the inner loop will be executed first thsn outside loop
			for(int anotherIndex=index+1; anotherIndex < array.length ;anotherIndex++)
				if(array[index] > array[anotherIndex]){
					int temp=0;
					temp=array[index];
					array[index]=array[anotherIndex];
					array[anotherIndex]=temp; 
				}
				System.out.println(+array[index]);
				}
				
				
		}		
	
	}