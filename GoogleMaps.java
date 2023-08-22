class GoogleMaps{


static String roads[]={ "hosur road", "MG road", "KG road", "lalbhag road", "hosa road", "Vatal Nagaraj road",
"Danvathri road", "Palace road", "RG road", "IG road", "Dr Ambedkar road", "Dr Rajakumar road", "Mission road",
"langford road", "Marigowda Road", "outer ring road", "kothnur road", "Bannergatta main road",
"Mangal Road", "Magadi road","BM road", "kamaraj road", "St Johns road", "Tarapore Officer road", "Promenade road", "Assaye Road"};


         public static void main(String args[]){



        System.out.println("the road is " + roads[2] + roads[5] + roads[7] + roads[12] + roads[13] + roads[14] + roads[20] + roads[23] + roads[25] + roads[15]);
		System.out.println("this is using old method ");
		
		System.out.println("THE ROAD NAMES FROM LEFT TO RIGH----------------------");
		for(int index=0;index<roads.length;index++){
			System.out.println(roads[index]);
			
		}
		System.out.println("the length of roads are"+roads.length);
		System.out.println("THE ROAD NAMES FROM RIGHT TO LEFT---------------------");
		for(int index=roads.length-1;index>=0;index--){
			System.out.println(roads[index]);
			
		}
		
}
}