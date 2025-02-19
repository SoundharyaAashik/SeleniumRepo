package week3.homeassignments.inheritance;

public class AddSubClassRadioButton extends SubclassButton{
	
	public void selectRadioButton() {
		System.out.println("Selected the radio button");

	}

	public static void main(String[] args) {
		AddSubClassRadioButton rb = new AddSubClassRadioButton();
		rb.submit();
		rb.selectRadioButton();

	}

}
