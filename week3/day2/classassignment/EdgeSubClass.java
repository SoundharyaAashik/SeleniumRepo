package week3.day2.classassignment;

public class EdgeSubClass extends BrowserParentClass{
	
	public void takeSnap() {
		System.out.println("Screenshots are taken");		
	}
	
	public void clearCookies() {
		System.out.println("Cookies are cleared");		
	}

	public static void main(String[] args) {
		EdgeSubClass edgeoptions = new EdgeSubClass();
		edgeoptions.takeSnap();
		edgeoptions.clearCookies();
		edgeoptions.openURL();
		edgeoptions.closeBrowser();
		edgeoptions.navigateBack();

	}

}
