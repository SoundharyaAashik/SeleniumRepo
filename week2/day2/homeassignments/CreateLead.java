package week2.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");	
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter UserName
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on the "Leads" tab
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Enter a FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Soundharya");
		//Enter a LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajendran");
		//Enter a CompanyName		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		//Enter a Title
		String GivenTitle = "Testing";
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys(GivenTitle);
		//Click the "Create Lead" button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Verify that the Title is displayed correctly
		String DisplayedTitle = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
		if(GivenTitle.equals(DisplayedTitle))
		{
			System.out.println("Match Found");
		}else {
			System.out.println("Match not Found");
		}
		driver.close();
	}

}
