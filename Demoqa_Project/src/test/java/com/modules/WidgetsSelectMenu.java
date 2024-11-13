package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WidgetsSelectMenu {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,600)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]")).click();
		 js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void select(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[2]")).click();
		
		Actions actions=new Actions(driver);
		
		actions.sendKeys("Group 1, option 1").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"selectOne\"]")).click();
		actions.sendKeys("Mrs.").sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement oldstyle=driver.findElement(By.id("oldSelectMenu"));
		oldstyle.click();
		
		Select s1=new Select(oldstyle);
		
		s1.selectByVisibleText("Yellow");
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement Multidropdown=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[7]/div/div/div"));
		Multidropdown.click();
		
		actions.sendKeys("Green").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		actions.sendKeys("Red").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		WebElement MultiSelect=driver.findElement(By.id("cars"));

		Select s2=new Select(MultiSelect);
		
		s2.selectByValue("audi");
		s2.selectByValue("volvo");
		Thread.sleep(2000);
		
	}
}
