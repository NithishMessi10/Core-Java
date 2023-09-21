class RailwayExecuter{
	public static void main(String args[]){
		Railway railway=new Railway();
		railway.addTrainName("janshatbdi");
		railway.addTrainName("janshatbdi ");
		railway.addTrainName("chennai express");
		railway.addTrainName("delhi express");
		railway.addTrainName("kerala express");
		railway.addTrainName("mysore express");
		/*railway.addTrainName("talguppa express");
		railway.addTrainName("thiru express");
		railway.addTrainName("ghazi express");
		railway.addTrainName("jammu express");
		railway.addTrainName("kashi express"); 
		*/
		railway.getTrainName();
	}
}