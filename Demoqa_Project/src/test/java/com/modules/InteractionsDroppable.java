package com.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InteractionsDroppable {
	
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 element.click();
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[5]/div/ul/li[4]")).click();
		 Thread.sleep(2000);
		  
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"droppableContainer\"]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(3000);
		 	 
	}
	
	@Test(priority = 2)
	public void simpleDrop(WebDriver driver) throws InterruptedException {
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		
		String msg=drop.getText();
		if(msg.equals("Dropped!")) {
			System.out.println("Dropped Successfully!");
		}else {
			System.out.println("FAIL");
		}
	}
	
	@Test(priority = 3)
	public void accepDrop(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("droppableExample-tab-accept")).click();
		Thread.sleep(2000);
		
		WebElement accept=driver.findElement(By.id("acceptable"));
		WebElement notaccept=driver.findElement(By.id("notAcceptable"));
		WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(accept, drop).perform();
		Thread.sleep(2000);
		
		actions.dragAndDrop(notaccept, drop).perform();
		Thread.sleep(2000);
		
		String msg=drop.getText();
		if(msg.equals("Dropped!")) {
			System.out.println("Dropped Successfully!");
		}else {
			System.out.println("FAIL");
		}
	}
	
	@Test(priority = 4)
	public void preventDrop(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
		Thread.sleep(2000);
		
		WebElement outerdrop = driver.findElement(By.id("notGreedyDropBox"));
		WebElement drag=driver.findElement(By.id("dragBox"));
		WebElement innerdrop = driver.findElement(By.id("notGreedyInnerDropBox"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(drag, outerdrop).perform();
		Thread.sleep(5000);
		actions.dragAndDrop(drag, innerdrop).perform();
		Thread.sleep(5000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement outerdropgreedy = driver.findElement(By.id("greedyDropBox"));
		WebElement innerdropnotgreedy = driver.findElement(By.id("greedyDropBoxInner"));
		
		actions.dragAndDrop(drag, outerdropgreedy).perform();
		Thread.sleep(5000);
		actions.dragAndDrop(drag, innerdropnotgreedy).perform();
		Thread.sleep(5000);
	}
	
	@Test(priority = 5)
	public void revertDrop(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("droppableExample-tab-revertable")).click();
		Thread.sleep(2000);
		
		WebElement revert = driver.findElement(By.id("revertable"));
		WebElement drop=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[2]"));
		WebElement notrevert = driver.findElement(By.id("notRevertable"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(revert,drop).click().perform();
		Thread.sleep(5000);
		actions.dragAndDrop(notrevert,drop).perform();
		Thread.sleep(5000);
	}
}
