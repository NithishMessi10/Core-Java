class MoneyNotes{
	static int Notes[]={10,20,50,100,500,2000};
	
	public static void main(String args[])
	{
		for(int index=Notes.length-1; index > 0 ;index--){
			System.out.println("The notes from higher denom to lower denom " + Notes[index]);
		}
	}
	
	
}\