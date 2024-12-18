package com.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ElementWebTable {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		action.click().perform();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(2000);
		
		WebElement element3=driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
		js.executeScript("arguments[0].scrollIntoView();", element3);
		driver.findElement(By.xpath("//*[@id=\"item-3\"]/span")).click();
		Thread.sleep(2000);
		
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/h1"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		
}
	@Test(priority = 2)
	public void addTable(WebDriver driver,String firstname,String lname,String email,String age,String Salary,String Dept) throws InterruptedException {
driver.findElement(By.id("addNewRecordButton")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("age")).sendKeys(age);
		Thread.sleep(1000);
		driver.findElement(By.id("salary")).sendKeys(Salary);
		Thread.sleep(1000);
		driver.findElement(By.id("department")).sendKeys(Dept);
		
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		
	}
}
