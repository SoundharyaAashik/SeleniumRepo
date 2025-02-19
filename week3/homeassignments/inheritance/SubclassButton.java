package week3.homeassignments.inheritance;

public class SubclassButton extends WebElement{

	public void submit() {
		System.out.println("Submitted");
	}
	
	public static void main(String[] args) {

		SubclassButton b = new SubclassButton();
		b.click();
		b.setText(" ");

	}
}