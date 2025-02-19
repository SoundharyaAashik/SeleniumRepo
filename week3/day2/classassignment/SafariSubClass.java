package week3.day2.classassignment;

public class SafariSubClass extends BrowserParentClass{
	
	public void readerMode() {
		System.out.println("Reader mode is ON");		
	}
	
	public void fullScreenMode() {
		System.out.println("Full Screen mode");		
	}
	
	public static void main(String[] args) {
		SafariSubClass safarioptions = new SafariSubClass();
		safarioptions.readerMode();
		safarioptions.fullScreenMode();
		safarioptions.openURL();
		safarioptions.closeBrowser();
		safarioptions.navigateBack();

	}

}
