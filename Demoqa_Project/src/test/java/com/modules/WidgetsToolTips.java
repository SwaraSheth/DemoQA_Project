package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WidgetsToolTips {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[7]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"toopTipContainer\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void hoverOver(WebDriver driver) throws InterruptedException {
		
		WebElement w1=driver.findElement(By.id("toolTipButton"));
		WebElement w2=driver.findElement(By.id("toolTipTextField"));
		WebElement w3=driver.findElement(By.xpath("//*[@id=\"texToolTopContainer\"]/a[1]"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(w1).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(w2).build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions.moveToElement(w3).build();
		a3.perform();
		Thread.sleep(2000);
		
		
	}
}
