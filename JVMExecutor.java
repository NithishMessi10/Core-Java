class JVMExecutor{

 public static void main(String args []){
	 JVM java = new JVM ();
	 java.setLoadFunction("load program");
	 java.setDepends("jdk");
	 java.setFullForm("java Run Time Environment");
	 java.setName("JVM");
	 
	 
	  Java hi = new Java();
	  hi.java = java;
	  
	    System.out.println(hi.java.getLoadFunction());
		System.out.println(hi.java.getDepends());
		System.out.println(hi.java.getFullForm());
		System.out.println(hi.java.getName());
	 
	 
	 
	 
	 
 }

}