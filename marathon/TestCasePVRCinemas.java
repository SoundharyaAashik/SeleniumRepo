package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasePVRCinemas {

	public static WebDriver driver;

	public void Chromedriver() {
		driver = new ChromeDriver();
	}

	public static void main(String[] args) throws InterruptedException {

		TestCasePVRCinemas pvrcinemas = new TestCasePVRCinemas();
		//Launch the Browser
		pvrcinemas.Chromedriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Load the Url 
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		//Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		pvrcinemas.WaitTime();
		//Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		pvrcinemas.WaitTime();		
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items'])/li[1]")).click();
		pvrcinemas.WaitTime();
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		pvrcinemas.WaitTime();
		//Select Your Movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]/span")).click();
		pvrcinemas.WaitTime();
		//Select Your Show Time
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]/span")).click();
		//Click on Book Button
		driver.findElement(By.xpath("//div[contains(@class,'quick-lefts')]//span")).click();
		pvrcinemas.WaitTime();
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//Click any one available seat
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Print the Seat info under book summary
		for (int i = 1; i <=2; i++) {
			WebElement SeatInfo = driver.findElement(By.xpath("((//div[@class='seat-info'])//p)["+i+"]"));
			System.out.println("The Seat Info is: "+SeatInfo.getText());
		}
		//Print the grand total under book summary
		WebElement Total = driver.findElement(By.xpath("(//div[contains(@class,'grand-tota')])[3]//span"));
		String GrandTotal = Total.getText();
		System.out.println("The Grand Total is : $"+GrandTotal);
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		pvrcinemas.WaitTime();
		//Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		pvrcinemas.WaitTime();
		//Print Your Current Page title
		String PageTitle = driver.getTitle();
		System.out.println("PageTitle is: "+PageTitle);
		//Close Browser
		driver.close();
	}

	public void WaitTime() throws InterruptedException {
		Thread.sleep(3000);		
	}
}
