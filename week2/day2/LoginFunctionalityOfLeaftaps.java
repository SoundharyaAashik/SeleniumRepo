package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionalityOfLeaftaps {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");	
				//Maximize the browser
				driver.manage().window().maximize();
				//Enter UserName
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Enter Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click on Leads
				driver.findElement(By.linkText("Leads")).click();
				//Click on Create Lead
				driver.findElement(By.linkText("Create Lead")).click();
				//Enter Company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Info");
				//Enter First Name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soundharya");
				//Enter Last Name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soundharya");
	}

}
