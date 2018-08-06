package com.calibroz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Its not compulsory,its for communication
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium_utilities\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/12426810/eclipse-wont-start-no-java-virtual-machine-was-found");
		
		
		
		
		//driver.findElements(By.cssSelector(".w3-bar a.w3-bar-item"));
		
		//wait statement
		
		//Thread.sleep(1000);
	/*	WebElement browseRemoteObject = driver.findElement(By.linkText("Log In"));
		browseRemoteObject.click();
		*/
		
		
	//explicit wait statement instead of thread.sleep
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		driver.findElement(By.name("q")).sendKeys("Browser not opening");
		
		driver.findElement(By.xpath("//input[@name='q']//following-sibling::button")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#mainbar #bigsearch+div.grid>div")));
		
		//using CSS
		//String results = driver.findElement(By.cssSelector("#mainbar #bigsearch+div.grid>div")).getText();
		
		//using xpath
		String results=driver.findElement(By.xpath("//div[@class='grid--cell fl1 fs-body3']")).getText();
		
		System.out.println(results);
		
		//using xpath
		System.out.println(driver.findElement(By.xpath("//div[@class='grid--cell fl1 fs-body3']//following-sibling::*[@class]")).getAttribute("class"));
		//using CSS
		System.out.println(driver.findElement(By.cssSelector("#mainbar #bigsearch+div.grid>div")).getAttribute("class"));
		
		driver.close();
		
		
	}

}
