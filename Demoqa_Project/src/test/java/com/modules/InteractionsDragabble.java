package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractionsDragabble {

	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 element.click();
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[5]")).click();
		 Thread.sleep(2000);
		  
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
		 	 
	}
}
