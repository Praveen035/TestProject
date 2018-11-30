package com.abc.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class L10
{
   public static void main(String[] args)
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.gmail.com");
	 driver.manage().window().maximize();
	 WebElement link=driver.findElement(By.partialLinkText("Index"));
	 link.click();
	 }
}
