package com.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WidgetsAutoComplete {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,400)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]")).click();
		 WebElement element1=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/h1[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void mutlipleColorname(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("autoCompleteMultipleInput")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys("Green").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		actions.sendKeys("Red").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void singleColorname(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("autoCompleteSingleInput")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys("Blue").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
	}
	
	
}