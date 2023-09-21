class Patient{
	private int patientId;
	private String patientName;
	private String patientAttenderName;
	private int patientAge;
	private String patientDiseaseName;
	private int patientWardNo;
	private String patientAdmittedDate;
	private String patientHospitalName;
	private String patientAddress;
	private String patientGender;
	private String patientConsultantDoctor;
	private String anotherPatientName;
	private int anotherPatientId;
	
	public Patient(){
		
	}
	public Patient(int anotherPatientId,String anotherPatientName){
		this.anotherPatientId=anotherPatientId;
		this.anotherPatientName=anotherPatientName;
	}
	public void getParameterised(){
		System.out.println(anotherPatientId+anotherPatientName);
	}
	
	
	
	
//patient id
public void setPatientId(int patientId){
	this.patientId=patientId;
}
public int getPatientId(){
	return patientId;
}
//name
public void setPatientName(String patientName){
	this.patientName=patientName;
}
public String getPatientName(){
	return patientName;
}
//attender name 
public void setPatientAttenderName(String patientAttenderName){
	this.patientAttenderName=patientAttenderName;
}
public String getPatientAttenderName(){
	return patientAttenderName;
}
//age
public void setPatientAge(int patientAge){
	this.patientAge=patientAge;
}
public int getPatientAge(){
	return patientAge;
}
//disease 
public void setPatientDiseaseName(String patientDiseaseName){
	this.patientDiseaseName=patientDiseaseName;
}
public String getPatientDiseaseName(){
	return patientDiseaseName;
}
//ward no
public void setPatientWardNo(int patientWardNo){
	this.patientWardNo=patientWardNo;
}
public int getPatientWardNo(){
	return patientWardNo;
}
//admitted date
public void setPatientAdmittedDate(String patientAdmittedDate){
	this.patientAdmittedDate=patientAdmittedDate;
}
public String getPatientAdmittedDate(){
	return patientAdmittedDate;
}
//hospital name
public void setPatientHospitalName(String patientHospitalName){
	this.patientHospitalName=patientHospitalName;
}
public String getPatientHospitalName(){
	return patientHospitalName;
}
//adress
public void setPatientAddress(String patientAddress){
	this.patientAddress=patientAddress;
}
public String getPatientAddress(){
	return patientAddress;
}
//gender
public void setPatientGender(String patientGender){
	this.patientGender=patientGender;
}
public String getPatientGender(){
	return patientGender;
}
//patient consultant doctor
public void setPatientConsultantDoctor(String patientConsultantDoctor){
	this.patientConsultantDoctor=patientConsultantDoctor;
}
public String getPatientConsultantDoctor(){
	return patientConsultantDoctor;
}
}