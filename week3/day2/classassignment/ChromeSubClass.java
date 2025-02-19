package week3.day2.classassignment;

public class ChromeSubClass extends BrowserParentClass{
	
	public void openIncognito() {
		System.out.println("Incognito is opened");		
	}
	
	public void clearCache() {
		System.out.println("Cache is cleared");		
	}
	
	public static void main(String[] args) {
		ChromeSubClass chromeoptions = new ChromeSubClass();
		chromeoptions.openIncognito();
		chromeoptions.clearCache();
		chromeoptions.openURL();
		chromeoptions.closeBrowser();
		chromeoptions.navigateBack();
		

	}

}
