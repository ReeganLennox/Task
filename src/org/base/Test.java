package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reegan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("dbhss.reegan@gmail.com");
		
		WebElement txtpassword= driver.findElement(By.id("pass"));
		txtpassword.sendKeys("Reeganjava1!");
		
		WebElement btnLogin= driver.findElement(By.xpath("//button[@value='login']"));
		btnLogin.click();
	}

}
