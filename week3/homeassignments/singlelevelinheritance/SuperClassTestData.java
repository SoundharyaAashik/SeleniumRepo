package week3.homeassignments.singlelevelinheritance;

public class SuperClassTestData {
	
	public void enterCredentials() {
		System.out.println("Entered the credentials");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigated to Home Page");
	}

	public static void main(String[] args) {
		SuperClassTestData td = new SuperClassTestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}
}
