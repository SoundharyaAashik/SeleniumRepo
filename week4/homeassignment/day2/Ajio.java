package week4.homeassignment.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='searchVal']"));
		SearchBox.sendKeys("Bags");
		SearchBox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(7000);
		WebElement ItemsFound = driver.findElement(By.xpath("(//div[@class='filter'])//strong"));
		String TotalItems = ItemsFound.getText();
		System.out.print(TotalItems);
		System.out.println(" ");

		List<WebElement> Brands = driver.findElements(By.xpath("(//div[@class='brand'])//strong"));
		int sizeofBrands = Brands.size();
		System.out.println("Total Number of Brand Name: "+sizeofBrands);

		for (int i = 0; i < Brands.size(); i++) {
			String BrandNames = Brands.get(i).getText();
			System.out.println(BrandNames);		
		}
		List<WebElement> BagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int NoofBags = BagNames.size();
		System.out.println("Total Number of Bags: "+NoofBags);

		for (int j = 0; j < BagNames.size(); j++) {
			String Bags = BagNames.get(j).getText();
			System.out.println(Bags);
		}
	}
}