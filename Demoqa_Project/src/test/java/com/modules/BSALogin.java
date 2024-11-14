package com.modules;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BSALogin {

	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 element.click();
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[1]/div/div/div[6]/div/ul/li[1]")).click();
		 Thread.sleep(2000);
		 
		 WebElement element1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));
		 js.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(2000);
		 
	}
	
	@Test(priority = 2)
	public void clickLogin(WebDriver driver) throws Exception {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[6]/div/ul/li[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void newUserRegi(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstname")).sendKeys("Tops");
		Thread.sleep(1000);
		driver.findElement(By.id("lastname")).sendKeys("Technology");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("TOPS");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Tops@1234");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, 200)");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"g-recaptcha\"]/div/div/iframe")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.findElement(By.id("register")).click();
		Thread.sleep(1000);
		
		if(driver.getCurrentUrl().equals("https://demoqa.com/register"))
		{
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[6]/div/ul/li[1]")).click();
			Thread.sleep(2000);
			
		}
		else {
			
			driver.findElement(By.id("register"));
			Thread.sleep(1000);			
			System.out.println("Register page:- ");
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			
//			a1.dismiss();
			Thread.sleep(2000);
			a1.accept();
			
		}
		
	}
	
	@Test(priority = 4)
	public void backtoLogin(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("gotologin")).click();
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 5)
	public void loginBSA(WebDriver driver) throws Exception {
		
		driver.findElement(By.id("userName")).sendKeys("TOPS");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Tops@1234");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 100)");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
	}
	
	
}
