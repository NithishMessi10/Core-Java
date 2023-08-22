class Sort1{
	
	public static void main(String args[]){
		
		int array[]={21,78,1,89,62,100};
		int array1[]={34,22,99,55,24,12};
		
		sort(array);
		sort(array1);
	}
				
				
				public static void sort(int array[]){
					for(int index=0;index <array.length;index++){
			for(int anotherIndex=index+1;  anotherIndex < array.length;anotherIndex++)
				if(array[index] > array[anotherIndex]){
					int temp=0;
					temp=array[index];
					array[index]=array[anotherIndex];
					array[anotherIndex]=temp;
				}
				//System.out.println(+array[anotherIndex]);
			
				System.out.println(+array[index]);
				}
				}		
	}