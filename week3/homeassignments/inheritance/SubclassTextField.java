package week3.homeassignments.inheritance;

public class SubclassTextField extends WebElement{
	
	public void getText() {
		System.out.println("Got the text");
	}

	public static void main(String[] args) {
		
		SubclassTextField tf = new SubclassTextField();
		tf.click();
		tf.setText(" ");
		tf.getText();
	}
}