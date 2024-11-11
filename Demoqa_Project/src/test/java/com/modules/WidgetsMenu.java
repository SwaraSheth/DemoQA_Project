package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WidgetsMenu {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,600)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]")).click();
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void menuItems(WebDriver driver) throws InterruptedException {
		
		
		WebElement Main_Item_1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"));
		WebElement Main_Item_2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		WebElement Sub_List=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		WebElement Sub_Item1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
		WebElement Main_Item_3=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a"));
		
		Actions	actions=new Actions(driver);
		
		Action a1=actions.moveToElement(Main_Item_1).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(Main_Item_2).build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions.moveToElement(Sub_List).build();
		a3.perform();
		Thread.sleep(2000);
		
		Action a4=actions.moveToElement(Sub_Item1).build();
		a4.perform();
		Thread.sleep(2000);
		
		Action a5=actions.moveToElement(Main_Item_3).build();
		a5.perform();
		Thread.sleep(2000);
	}
	
}
