package OOP_Interface;

public class TestHospital {
		

	public static void main(String[] args) {

		FortisHoapital fh =new FortisHoapital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.medicalTraining();
		fh.medicalResearch();
		USMedical.billing();
		fh.billing();
		fh.medicaRD();
		fh.medicaRD();
		fh.dentalServices(100);
		fh.covid19();
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHoapital.min_fee);
		
		System.out.println("-----------");
		//top casting: child class object can be referred by parent interface ref variable
		USMedical us = new FortisHoapital();
		
		us.cardioServices();
		us.neuroServices();
		us.emergencyServices();
		us.physioServices();
		
		UKMedical uk = new FortisHoapital();
		uk.dentalServices();
		uk.emergencyServices();
		uk.entServices();
		
		
		
		
		
		

	}

}
