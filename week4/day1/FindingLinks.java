package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		//Launching the browser
		ChromeDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://www.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Search for elements
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int NumberofLinks = allLinks.size();
		System.out.println(NumberofLinks);

		List<String> allStrings = new ArrayList<String>();
		for (int i = 0; i < NumberofLinks; i++) {
			String text = allLinks.get(i).getText();			
			allStrings.add(text);
		}
		System.out.println("The list is:"+allStrings);
	}

}
