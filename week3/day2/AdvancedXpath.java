package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Parent to Child
		driver.findElement(By.xpath("//form[@id='login']/p[1]"));
		//Child to Parent
		driver.findElement(By.xpath("//input[@id='password']/parent::p"));
		//GrandParent to GrandChild
		driver.findElement(By.xpath("//div[@id='form']//p[2]"));
		//GrandChild to GrandParent
		driver.findElement(By.xpath("//form[@id='login']/ancestor::div[2]"));
		//Elder Sibling to Younger Sibling
		
	}

}
