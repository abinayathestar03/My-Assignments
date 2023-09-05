package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2part1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Pranesh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("pranesh");
		driver.findElement(By.id("lastNameField")).sendKeys("saravanan");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Prani");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Information Technology");
		//driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail')]")).sendKeys("abinayathestar03@gmail.com");
		driver.findElement(By.name("primaryEmail")).sendKeys("abinayathestar03@gmail.com");
		WebElement dd= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sel=new Select(dd);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title is:"+driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("IT");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title is:"+driver.getTitle());
	}

}
 