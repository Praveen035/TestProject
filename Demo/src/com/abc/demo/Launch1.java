package com.abc.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch1 
{
   public static void main(String[] args) throws InterruptedException
	{
	  String url="www.gmail.com";
	  WebDriver driver=new ChromeDriver();
	  driver.get(url);
	  Thread.sleep(10000);
	  driver.close();
    }
}