class BarBrands{ 
    static String Brands[] = {
        "100 Piper's", "McRum", "Johnnie Walker", "Black Dog", "McWhisky",
        "Bagpiper", "Glenfiddich", "Blender's Pride", "Irish Whisky",
        "Vat 69", "Wild Turkey", "Old Monk", "Black & White",
        "IB (likely Indian Bourbon)", "Manshion House", "Choice",
        "Officer's Choice", "8 PM", "Bowmore"
    };

    public static void main(String args[]) {
		System.out.println("main has started");
        System.out.println("My Brand is " + Brands[4] + Brands[0] + Brands[1] + Brands[2]
                + Brands[3] + Brands[4] + Brands[5] + Brands[6] + Brands[7] + Brands[8]
                + Brands[9] + Brands[10]);
		System.out.println("old method using so many statements");
		
		System.out.println("using for loops from    right---------->left");
		for(int index=0; index < Brands.length;index++){
			System.out.println("The bar brands from  right to left");
			System.out.println(Brands[index]);
		}
System.out.println("using for loop from   left ---------------->right");
		for(int index=Brands.length-1; index>=0;index--){
			System.out.println("the bar brands from right to left");
			System.out.println(Brands[index]);
		
				}
				
    }
}