package week4.day1;

public class Sbi implements Rbi{
	
	public void setInterestRates() {
		System.out.println("4.5%");
		
	}

	public void verifyKyc() {
		System.out.println("PAB is Mandatory");
		
	}
	
	public void provideCarLoan() {
		System.out.println("Car Loan");

	}

	public static void main(String[] args) {
		Sbi sbiservice = new Sbi();
		sbiservice.setInterestRates();
		sbiservice.verifyKyc();
		sbiservice.provideCarLoan();

	}

	

}
