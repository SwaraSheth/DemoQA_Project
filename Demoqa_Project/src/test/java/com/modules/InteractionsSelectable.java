package com.modules;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractionsSelectable {

	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 element.click();
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[2]")).click();
		 Thread.sleep(2000);
		  
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"listContainer\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
		 	 
	}
	
	@Test(priority = 2)
	public void selectableList(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[4]")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 3)
	public void selectableGrid(WebDriver driver) throws InterruptedException{
		
		driver.findElement(By.id("demo-tab-grid")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"row1\"]/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"row2\"]/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"row3\"]/li[3]")).click();
		Thread.sleep(2000);
		
	}
}
