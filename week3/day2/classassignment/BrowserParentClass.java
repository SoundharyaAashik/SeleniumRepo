package week3.day2.classassignment;

public class BrowserParentClass{
	
	public void openURL() {
		System.out.println("URL is opened");		
	}	
	public void closeBrowser() {
		System.out.println("Browser is closed");		
	}	
	public void navigateBack() {
		System.out.println("Navigated back");	
	}
	public static void main(String[] args) {		
		//String browserName, browserVersion;
		BrowserParentClass browseroptions = new BrowserParentClass();
		browseroptions.openURL();
		browseroptions.closeBrowser();
		browseroptions.navigateBack();
		
	}

}
