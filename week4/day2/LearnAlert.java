package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//switch to alert
		Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertText = simpleAlert.getText();
		System.out.println("Simple Alert Text is: "+simpleAlertText);
		simpleAlert.accept();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompAlert = driver.switchTo().alert();
		String pa = simpleAlert.getText();
		System.out.println(pa);
		prompAlert.sendKeys("Soundharya");
		prompAlert.accept();
		
		//Sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
	}

}
