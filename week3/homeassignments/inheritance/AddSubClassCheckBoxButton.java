package week3.homeassignments.inheritance;

public class AddSubClassCheckBoxButton extends SubclassButton{
	
	public void clickCheckButton() {
		System.out.println("Clicked the check button");
	}

	public static void main(String[] args) {
		AddSubClassCheckBoxButton cbb = new AddSubClassCheckBoxButton();
		cbb.submit();
		cbb.clickCheckButton();
	}

}
