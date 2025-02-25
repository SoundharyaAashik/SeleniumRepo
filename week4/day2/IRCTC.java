package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.findElement(By.xpath("//span[contains(@class,'circleone')]")).click();
		//getWindowHandle
		String parentWindow = driver.getWindowHandle();	
		//getWindowHandles
		Set<String> windowHandles = driver.getWindowHandles();				
		//convert set to list
		List<String> childWindow = new ArrayList<String>(windowHandles);
		String childAddress = childWindow.get(1);
		driver.switchTo().window(childAddress);
		//Title of Child Window
		String titleofChildWindow = driver.getTitle();
		System.out.println("Title of Child Window is: "+titleofChildWindow);
		//Close Parent Tab
		driver.switchTo().window(childWindow.get(0));
		driver.close();
		
	}

}
