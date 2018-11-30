package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAttributeTagName
{
	public static void main(String args[]) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		WebElement myAcct=driver.findElement(By.linkText("My Account"));
		System.out.println(myAcct.getText());
		System.out.println(myAcct.getAttribute("href"));
		System.out.println(myAcct.getTagName());
	}

}
