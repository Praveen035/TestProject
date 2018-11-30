package com.abc.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class L2 
{
  public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
	}
}
	      

