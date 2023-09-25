class PatientExecutor{
 public static void main(String args []){
 
 Patient ref = new Patient();
 ref.setName("Siddu");
 ref.setPlace("Belagavi");
 ref.setId(7);
 ref.setPrice(1600);
 
 
 Hospital hospital = new Hospital ();
 hospital.patient = ref;

System.out.println(hospital.patient.getName());
System.out.println(hospital.patient.getPlace());
System.out.println(hospital.patient.getId());
System.out.println(hospital.patient.getPrice()); 

 
 }

}