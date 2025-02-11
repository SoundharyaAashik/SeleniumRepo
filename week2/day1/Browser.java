package week2.day1;

public class Browser {
	
	public String launchBrowser(String browser) {
		//System.out.println("Launched Browser");	
		System.out.println(browser);		
		return "Browser launch success";

	}
	public void loadURL() {
		System.out.println("Lauched URL");

	}

	public static void main(String[] args) {		
		Browser browseroptions = new Browser();
		String launchBrowser = browseroptions.launchBrowser("launchbrowser");
		System.out.println(launchBrowser);
		//browseroptions.launchBrowser("Browser launch successfully");
		//browseroptions.loadURL();
		

	}

}
