package com.calibroz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Experiment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");	
		
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("src")));
		driver.findElement(By.id("src")).sendKeys("Kochi");
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("dest")));
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[@for='onward_cal']")));
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		driver.findElement(By.id("search_btn")).click();
		//driver.close();
	
	}

}
