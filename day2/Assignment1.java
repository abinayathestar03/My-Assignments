package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("priya");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("9880671170");
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("abinaya");
		WebElement dd= driver.findElement(By.id("day"));
		Select sel=new Select(dd);
		sel.selectByIndex(8);
		WebElement mon= driver.findElement(By.id("month"));
		Select sel1=new Select(mon);
		sel1.selectByVisibleText("Sep");
		WebElement year= driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("1992");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
				
		
		
		
		
		
		

		
	}





}
