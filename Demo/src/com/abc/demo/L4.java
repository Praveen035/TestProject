package com.abc.demo;
import org.openqa.selenium.chrome.ChromeDriver;
public class L4 
{
   public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
    }
}
