package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InteractionsSortable {

	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 element.click();
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[1]")).click();
		 Thread.sleep(2000);
		  
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"sortableContainer\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
		 
		 
	}
	
	@Test(priority = 2)
	public void sortableList(WebDriver driver) throws InterruptedException {
		
		WebElement one=driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
		Thread.sleep(1000);
		WebElement four=driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]"));
		Thread.sleep(1000);
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(one, four).perform();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void sortableGrid(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("demo-tab-grid")).click();
		
		WebElement one=driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
		Thread.sleep(1000);
		WebElement four=driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[4]"));
		Thread.sleep(1000);
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(one, four).perform();
		Thread.sleep(2000);
	}
}
