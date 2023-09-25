class ApplicationExecutor{

	public static void main(String args []){
		
		Application app = new Application();
		app.setName("PhonePe");
		app.setSizeInMb(45.2);
		app.setVersion("v 8.0");
		
		
		
			PlayStore store = new PlayStore();
			 //has a Relationship
			store.application = app;
			store.manageBy = "Google";
			
			
			
			System.out.println(store.application.getName());
			System.out.println(store.application.getSizeInMb());
			System.out.println(store.application.getVersion());
		
			
			
	}
}