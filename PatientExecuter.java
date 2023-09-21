class PatientExecuter{
	public static void main(String args[]){
		
		System.out.println("The parameterised is invoked ");
		Patient pat1=new Patient(1,"Nelson");
		pat1.getParameterised();
		System.out.println("The parameterised is got executed");
		System.out.println("---------------------------------");
		Patient pat=new Patient();
		pat.setPatientId(1);
		System.out.println("The patient id is "+pat.getPatientId());
		pat.setPatientName("chatni");
		System.out.println("The patient Name is"+pat.getPatientName());
		pat.setPatientAttenderName("Surya");
		System.out.println("the patient attender name is"+pat.getPatientAttenderName());
		pat.setPatientAge(70);
		System.out.println("the patient age is"+pat.getPatientAge());
		pat.setPatientDiseaseName("viral fever");
		System.out.println("the patient disease name is"+pat.getPatientDiseaseName());
		pat.setPatientWardNo(20);
		System.out.println("the patient ward number"+pat.getPatientWardNo());
		pat.setPatientAdmittedDate("20-02-2023");
		System.out.println("the patient admitted date  is"+pat.getPatientAdmittedDate());
		pat.setPatientHospitalName("Kamasaki");
		System.out.println("the patient hospital name is"+pat.getPatientHospitalName());
		pat.setPatientAddress("banglore");
		System.out.println("the patient adress is"+pat.getPatientAddress());
		pat.setPatientGender("m");
		System.out.println("the patient gender is"+pat.getPatientGender());
		pat.setPatientConsultantDoctor("nirup");
		System.out.println("the patient consultant  is"+pat.getPatientConsultantDoctor());
	}
}