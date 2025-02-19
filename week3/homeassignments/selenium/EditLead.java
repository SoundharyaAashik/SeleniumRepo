package week3.homeassignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
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
		//Enter a CompanyName		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		//Enter a FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Soundharya");
		//Enter a LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajendran");
		//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Test");
		//Enter the Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testdepartment");
		//Enter the Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Testdescription");
		//Enter your email in the E-mail address Field
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("soundharya@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement findElement = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dd = new Select(findElement);
		dd.selectByVisibleText("New York");
		//Click on the Create Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Click on the edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Clear the Description Field
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Important Notice");
		//Click on the update button
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		//Get the Title of the Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		//Close the browser window
		driver.close();
	}

}
