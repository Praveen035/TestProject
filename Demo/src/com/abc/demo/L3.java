package com.abc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class L3 
{
  public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String source=driver.getPageSource();
		System.out.println(source);
	}

}
