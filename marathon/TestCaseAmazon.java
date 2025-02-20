package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAmazon {

	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome  
		ChromeDriver driver = new ChromeDriver();	
		//Load the URL
		driver.get("https://www.amazon.in/");
		//Add Wait Time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		driver.manage().window().maximize();
		//Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		Thread.sleep(2000);
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//div[contains(text(),'bags for boys')]")).click();	
		//Print the total number of results (like 50000)
		 for (int i = 1; i<= 3; i++) { 
		 WebElement results = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span["+i+"]")); 
		 String result = results.getText(); 
		 System.out.print(result+" "); 		 
		 }	
		 System.out.println(" ");
		 //Select the first 2 brands in the left menu
		  for (int j = 3; j <= 4; j++) { 
		 WebElement brands = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])["+j+"]")); 
		  if(!brands.isSelected()) 
		  { 
			  brands.click(); 
			  } 
		  }
		  //Choose New Arrivals (Sort)
		  driver.findElement(By.xpath("(//span[contains(@id,'announce')])[1]")).click();
		  driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		  //Scrolling Down
		  WebElement BagsName = driver.findElement(By.xpath("(//a[contains(@class,'s-line-clamp')])[1]"));
		  String BagName = BagsName.getText(); 
		  System.out.println("The Bag Name is: "+BagName);
		  //Print the first resulting bag info (name, discounted price)
		  WebElement discount = driver.findElement(By.xpath("(//div[@class='a-row'])[2]/span[last()]"));
		  System.out.println("The Discount Price is: "+discount.getText());		  
		  System.out.println("The Page Title is: "+driver.getTitle());
		  //Get the page title and close the browser
		  driver.close();
	}

}
