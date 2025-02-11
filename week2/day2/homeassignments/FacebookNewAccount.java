package week2.day2.homeassignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on the Create new account button
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		//Enter the First name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Soundharya");
		//Enter the Surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Soundharya");
		//Enter the Mobile number or email address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Soundharya@gmail.com");
		//Enter the New password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Soundharya@1234");
		//Handle all three dropdowns in Date of birth
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd1 = new Select(dropdown1);
		dd1.selectByIndex(3);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd2 = new Select(dropdown2);
		dd2.selectByValue("5");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select dd3 = new Select(dropdown3);
		dd3.selectByVisibleText("2020");
		//Select the radio button in Gender
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		
		driver.close();
		
		

	}

}
