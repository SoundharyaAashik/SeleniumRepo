package week3.homeassignments.inheritance;


public class WebElement {
	
	public void click() {
		System.out.println("Clicked");

	}
	public void setText(String Text) {
		System.out.println("Sent the text");

	}
	
	public static void main(String[] args) {
		WebElement wb = new WebElement();
		wb.click();
		wb.setText("");
	}

}
