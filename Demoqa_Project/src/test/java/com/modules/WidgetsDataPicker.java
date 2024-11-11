package com.modules;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WidgetsDataPicker {
	@Test(priority = 1)
	public void clickElement(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[1]"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]")).click();
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,400)");
		 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]")).click();
		 js.executeScript("window.scrollBy(0,200)");
		 Thread.sleep(3000);
	}
	
	public void selectDate(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(2000);
		
		WebElement monthElement=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select s1=new Select(monthElement);
		s1.selectByVisibleText("February");
		Thread.sleep(2000);
		
		WebElement yearElement=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select s2=new Select(yearElement);
		s2.selectByVisibleText("1994");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
	}
	
	public void selectDateNTime(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[7]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[79]")).click();
		Thread.sleep(2000);
	}
}
