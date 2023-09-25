class Application{


private String name;
private double sizeInMb;
private String version;
private String ratings;
private String noOfDownload;
private String companyName;



	public Application(){
		
		
	}

	public void setName(String name){
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}


	
	public void setSizeInMb(double sizeInMb){
		this.sizeInMb = sizeInMb;
	}
	
	public double getSizeInMb(){
		return sizeInMb;
	}
	
	
		public void setVersion(String version){
			this.version = version;
		}
		
		
		public String getVersion(){
			return version;
		}
		
		
		
		
		public void setRatings(String ratings){
			this.ratings = ratings;
		}
			public String getRatings(){
				return ratings;
			}
			
			
			
				public void setNoOfDownload(String noOfDownload){
					this.noOfDownload =noOfDownload;
				}
				
				public String getNoOfDownload(){
					return noOfDownload;
				}
				
		public void setCompanyName(String companyName){
			this.companyName =companyName;
		}

		public String getCompanyName(){
			
			return companyName;
		}
}





















