package week4.day1;

public class Hdfc implements Rbi{
	
	public void setInterestRates() {
		System.out.println("5.5%");
		
	}

	public void verifyKyc() {
		System.out.println("Aadhar is Mandatory");
		
	}
	
	public static void main(String[] args) {
		Hdfc HdfcService = new Hdfc();
		HdfcService.setInterestRates();
		HdfcService.verifyKyc();

	}


}
