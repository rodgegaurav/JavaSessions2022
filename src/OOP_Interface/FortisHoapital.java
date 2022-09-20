package OOP_Interface;

public class FortisHoapital extends Medical implements USMedical, UKMedical, IndianMedical {


	
	@Override
	public void cardioServices() {
		System.out.println("FS--cardioServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FS--neuroServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FS--physioServices");
		
	}


	@Override
	public void dentalServices() {
		System.out.println("FS--dentalServices");
		
	}
	
	@Override
	public void dentalServices(int a) {
		System.out.println("FS--dentalServices"+a);
		
	}

	@Override
	public void entServices() {
		System.out.println("FS--entServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FS--pediaServices");
		
	}

	@Override
	public void onclogyServices() {
		System.out.println("FS--onclogyServices");
		
	}

	//Common Method come only once;
	@Override
	public void emergencyServices() {
		System.out.println("FS--emergencyServices");
		
	}
	
	//Individula Method;
	
	public void medicalTraining() {
		System.out.println("FS--medicalTraining");
	}
	
	public void medicalInsurance() {
		System.out.println("FS--medicalInsurance");
	}

	//Method Hiding
	public static void billing() {
		System.out.println("FS--biling");
	}

	@Override
	public void covid19() {
		System.out.println("FS -- cobis 19");
		
	}
	
//	@Override
//	public void medicaRD(){
//		System.out.println("FS -- medicaRD");
		
	

}
