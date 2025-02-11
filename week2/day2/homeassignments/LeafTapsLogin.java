package week2.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsLogin {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
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
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		//Enter an account name
		String givenaccountName = "TestingAutomation50";
		System.out.println("Given Account Name: "+givenaccountName);
		driver.findElement(By.id("accountName")).sendKeys(givenaccountName);
		//Enter a description as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select "ComputerSoftware" as the industry
		WebElement dropdown1 = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(dropdown1);
		dd1.selectByIndex(3);
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue
		WebElement dropdown3 = driver.findElement(By.id("dataSourceId"));
		Select dd3 = new Select(dropdown3);
		dd3.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement dropdown4 = driver.findElement(By.id("marketingCampaignId"));
		Select dd4 = new Select(dropdown4);
		dd4.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue
		WebElement dropdown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd5 = new Select(dropdown5);
		dd5.selectByValue("TX");
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		//Verify that the account name is displayed correctly
		String displayedAccName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println("Displayed Account Name: "+displayedAccName);
		if(displayedAccName.contains(givenaccountName)) {
			System.out.print("Account name is matching");
		}else
		{
			System.out.print("Account name is not matching");
		}
		//Close the browser window
		driver.close();
		
		
		

	}

}
