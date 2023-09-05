package week2.day2;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Advancedxpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form[contains(@class,'css')]/input"));
		driver.findElement(By.xpath("//input[contains(@class,'css')]/parent::form"));
	}

}
