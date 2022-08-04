package com.mm.advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		clickHere.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		driver.quit();

	}

}
