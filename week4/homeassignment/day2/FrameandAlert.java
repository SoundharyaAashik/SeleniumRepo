package week4.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlert {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		//Maximize the browser window
		driver.manage().window().maximize();
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Switch to Alert
		Alert alert = driver.switchTo().alert();
		//Accepting the alert box
		alert.accept();
		//Verifying the text
		WebElement verifyText = driver.findElement(By.xpath("//p[@id='demo']"));
		if(verifyText.isDisplayed()) {
			System.out.println(verifyText.getText());
		}
	}
}