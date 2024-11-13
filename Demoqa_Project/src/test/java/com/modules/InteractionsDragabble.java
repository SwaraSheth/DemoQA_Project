package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@Test(priority = 2)
	public void simpleDrag(WebDriver driver) throws InterruptedException {
		
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"dragBox\"]"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(drag, 50, 50).build().perform();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 3)
	public void axixRestrictedDrag(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Axis Restricted']")).click();
		Thread.sleep(2000);
		
		WebElement onlyX=driver.findElement(By.xpath("//*[@id=\"restrictedX\"]"));
		WebElement onlyY=driver.findElement(By.xpath("//*[@id=\"restrictedY\"]"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(onlyX, 50, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(onlyY, 0, 50).build().perform();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 4)
	public void containerRestrictedDrag(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("draggableExample-tab-containerRestriction")).click();
		Thread.sleep(2000);
		
		WebElement withinbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div"));
		WebElement winthinparent=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/span")); 
		Actions act=new Actions(driver);					
		
		act.dragAndDropBy(withinbox, 150, 50).build().perform();
		Thread.sleep(2000);
		act.dragAndDropBy(winthinparent, 10, 50).build().perform();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 5)
	public void cursorStyleDrag(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("draggableExample-tab-cursorStyle")).click();
		Thread.sleep(2000);
		
		WebElement centerbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[1]"));
		WebElement leftbox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[2]"));
		WebElement bottombox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[3]"));
		
		Actions act=new Actions(driver);					
		
		 act.dragAndDropBy(centerbox, 150, 110).build().perform();
		 act.dragAndDropBy(leftbox, 75, 30).build().perform();
		 act.dragAndDropBy(bottombox, 50, 50).build().perform();
	}
	
}
