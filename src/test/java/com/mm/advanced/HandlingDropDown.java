package com.mm.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		dropDown.click();
		
		/*	selectByIndex
		 * 	selectByVisibleText
		 * 	selectByVlaue */
		
		Select select = new Select(dropDown);
		select.selectByIndex(1);
		Thread.sleep(5000);
		select.selectByVisibleText("Option 2");
		Thread.sleep(5000);
		select.selectByValue("1");
		
	}

}
