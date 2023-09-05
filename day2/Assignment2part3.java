package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2part3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//li[3]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("abinayathestar03@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement elmt=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr//div/a"));
		String str=elmt.getText();
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr//div/a")).click();
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		System.out.println("the title is:"+driver.getTitle());
		driver.findElement(By.name("submitButton")).click();
		
		
		
	}

}
