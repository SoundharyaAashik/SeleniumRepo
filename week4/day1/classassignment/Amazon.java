package week4.day1.classassignment;

public class Amazon extends CanaraBank{
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");		
	}
	public void upiPayments() {
		System.out.println("UPI Payments");		
	}
	public void cardPayments() {
		System.out.println("Card Payments");		
	}
	public void internetBanking() {
		System.out.println("Internet Banking");		
	}
	@Override
	public void recordPaymentDetails() {
		System.out.println("Record Payment Details");		
	}	
	public static void main(String[] args) {
		
		Amazon AmazonService = new Amazon();
		AmazonService.cashOnDelivery();
		AmazonService.upiPayments();
		AmazonService.cardPayments();
		AmazonService.internetBanking();
		AmazonService.recordPaymentDetails();
	}
}
