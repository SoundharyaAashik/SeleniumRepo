package week3.homeassignments.singlelevelinheritance;

public class SubClassLoginTestData extends SuperClassTestData{
	public void enterUsername() {
		System.out.println("Entered the User Name");
	}
	
	public void enterPassword() {
		System.out.println("Entered the Password");
	}

	public static void main(String[] args) {
		SubClassLoginTestData ltd = new SubClassLoginTestData();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
	}
}
