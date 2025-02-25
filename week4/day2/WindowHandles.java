package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandle
		String windowHandle = driver.getWindowHandle();
		System.out.println("The Address of the Parent window is: "+windowHandle);

		//getWindowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All addresses are: "+windowHandles);
		
		List<String> childWindow = new ArrayList<String>(windowHandles);
		
	}	

}
