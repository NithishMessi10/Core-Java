class Hotel{
	static String foodmenu[]={"cofee","tea","lemontea","masala tea","black tea","black coffee","green tea","mint tea","choco tea","kashaya",
	"idli","vada","masaladosa","setdosa","ravadosa","onion dosa","kharabath","kesaribath","ricebath","mosrana",
	"panipuri","sevpuri","masalapuri","bhelpuri","aloopuri","sukhapuri","dahipuri","pavbhaji","vadapav","aalosev",
	"roti","naan","chapathi","butter naan","paratha","aaluparatha","gheeparatha","tandoori","kulcha","butterkulcha",  
	"paneerbuttter","panneerkofta","malaikofta","veghydrabadi","vegkolhapuri","dalkichdi","palakpanner","shaahipanner","peas masala","kaju masala",
	"apple","chiku","banana","watermelon","orange","muskmelon","musambi","grapes","dragonfruit","papaya"};
	
	public static void main(String args[])
	{
		
		System.out.println("The hotel menu are" +foodmenu[1]+foodmenu[2]+foodmenu[3]+foodmenu[4]+foodmenu[5]+foodmenu[6]+foodmenu[7]+foodmenu[8]+foodmenu[9]+foodmenu[10]+
		foodmenu[11]+foodmenu[12]+foodmenu[13]+foodmenu[14]+foodmenu[15]+foodmenu[16]+foodmenu[17]+foodmenu[18]+foodmenu[19]+foodmenu[20]+
		foodmenu[21]+foodmenu[22]+foodmenu[23]+foodmenu[24]+foodmenu[25]+foodmenu[26]+foodmenu[27]+foodmenu[28]+foodmenu[29]+foodmenu[30]+
		foodmenu[31]+foodmenu[32]+foodmenu[33]+foodmenu[34]+foodmenu[35]+foodmenu[36]+foodmenu[37]+foodmenu[38]+foodmenu[39]+foodmenu[40]+
		foodmenu[41]+foodmenu[42]+foodmenu[43]+foodmenu[44]+foodmenu[45]+foodmenu[46]+foodmenu[47]+foodmenu[48]+foodmenu[49]+foodmenu[50]+
		foodmenu[51]+foodmenu[52]+foodmenu[53]+foodmenu[54]+foodmenu[55]+foodmenu[56]+foodmenu[57]+foodmenu[58]+foodmenu[59]);
		System.out.println("this is old method");
		
		System.out.println("printing values from left to right using for loops");
		for(int index=0;index<foodmenu.length;index++){
			System.out.println(foodmenu[index]);
		}
		
		System.out.println("printing values from right to left using for loops");
		for(int index=foodmenu.length-1;index>=0;index--)
		{
			System.out.println(foodmenu[index]);
		}
		
	}
}
