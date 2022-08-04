package com.mm.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		
		WebElement boxA = driver.findElement(By.id("column-a"));
		WebElement boxB = driver.findElement(By.id("column-b"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(boxA, boxB).build().perform();
		//Thread.sleep(5000);
		//drag.dragAndDrop(boxB, boxA).build().perform();
		

	}

}
