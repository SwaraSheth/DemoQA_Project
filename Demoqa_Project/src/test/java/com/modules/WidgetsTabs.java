package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WidgetsTabs {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,400)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"tabsContainer\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void clickTabs(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("demo-tab-origin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("demo-tab-use")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("demo-tab-what")).click();
		Thread.sleep(3000);
	}
}
