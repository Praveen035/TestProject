package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L7 
{
	public static void main(String[] args)
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("1234");

	}

}
