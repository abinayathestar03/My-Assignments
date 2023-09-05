package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Pranesh company");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pranesh");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("saravanan");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prani");
	driver.findElement(By.name("departmentName")).sendKeys("IT");
	driver.findElement(By.name("description")).sendKeys("Information Technology");
	driver.findElement(By.name("primaryEmail")).sendKeys("abinayathestar03@gmail.com");
	WebElement dd= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
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
