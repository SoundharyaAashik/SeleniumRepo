package week3.day2;

import javax.security.auth.callback.LanguageCallback;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser extends LaunchEdgeBrowser{
	
	//super - call my parent class
	public void launch() {
		super.launch();
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome");
	}

	public static void main(String[] args) {
		
		  LaunchBrowser browser = new LaunchBrowser(); 
		  browser.launch();
		 		
		/*
		 * LaunchEdgeBrowser brow = new LaunchEdgeBrowser(); brow.launch();
		 */
	}

}
