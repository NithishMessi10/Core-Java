 class Ascending{
	  		
			
	public static void main(String args[]){
		    int  array[]={23,432,54,32,786,75,67,22,134};
			//int  max =array[0];
			//int  min =array[0];
			int  array1[]={21,99,33,1};
			int  array2[]={12,93,48,932,99};
			
		maxmin(array);
		maxmin(array1);
		maxmin(array2);
	}
	
	public static void maxmin(int array[]){
		int max=array[0];
		int min=array[0];
		for(int index=0;index < array.length;index++){
			//for(int anotherIndex=index+1;  anotherIndex < array.length;anotherIndex++)
				if(array[index] < min){
					min=array[index];
				}
				else if(array[index] > max ){
					max=array[index];
				}
				
		}
		System.out.println("The Maximum value is " +max +"  "+ "The minimum value is"+min);
		
	}
	
	
 }    
			