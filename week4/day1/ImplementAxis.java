package week4.day1;

public class ImplementAxis extends Axis{

	public void setInterestRates() {
		System.out.println("10%");
		
	}

	public void verifyKyc() {
		System.out.println("Pan is mandatory");
		
	}

	@Override
	public void provideHomeLoan() {
		System.out.println("30 Lakhs");
				
	}
	
	@Override
	public void provideGoldLoan() {
		super.provideGoldLoan();
		System.out.println("Gold Loan 30 Lakhs");
				
	}
	
	public void DrivingLicense() {
		System.out.println("Driving Lisence is mandatory");
		
	}
	
	public static void main(String[] args) {
		ImplementAxis axisService = new ImplementAxis();
		axisService.setInterestRates();
		axisService.verifyKyc();
		axisService.provideHomeLoan();
		axisService.DrivingLicense();
		axisService.provideGoldLoan();
	}


}
