package week3.homeassignments.inheritance;

public class SubClassElements extends SubclassButton{
	
	public void elements() {
		System.out.println("This is the Sub class - Element");
	}

	public static void main(String[] args) {
		SubClassElements e = new SubClassElements();
		e.submit();
		e.click();
		e.setText("");
		e.elements();
	}
}