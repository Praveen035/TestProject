package com.abc.demo;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch
{
    public static void main(String[] args)
	{
	   System.setProperty("WebDriver.gecko.driver","D:\\SeleniumComponent\\geckodriver.exe");
	   FirefoxDriver driver=new FirefoxDriver();
	}

}