class StateExecutor{

	public static void main(String args[]){
		State state = new State();
		state.setName("Karnataka");
		state.setNoOfDistrics(30);
		state.setCm("Siddaramayya");
		
		
		
		Country ref = new Country();
		ref.state = state;
		
		
			System.out.println(ref.state.getName());
			System.out.println(ref.state.getNoOfDistrics());
			System.out.println(ref.state.getCm());
	}

}