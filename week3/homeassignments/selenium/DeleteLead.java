package week3.homeassignments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");;
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click the Login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click the "crm/sfa" link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on the "Leads" tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();		
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//System.out.println(driver.getTitle());
		//Click on the "Phone" tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//Capture the lead ID of the first resulting lead
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		System.out.println(leadID);		
		//Click the first resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'][1])[2]")).click();
		//driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]//div/a[1])[1]")).click();
		//Click the "Delete" button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);
		//Click "Find leads" again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//Verify the presence of the message "No records to display" in the Lead List
		String verifyMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(verifyMessage);
		if(verifyMessage.contains("No records to display")) {
			System.out.print("Message confirms the successful deletion");
		}else {
			System.out.print("Message confirms the unsuccessful deletion");
		}
		driver.close();
	}

}