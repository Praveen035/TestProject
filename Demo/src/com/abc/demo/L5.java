package com.abc.demo;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class L5
{
	public static void test(WebDriver driver)
	{
		driver.get("https://www.gmail.com");
        String Title=driver.getTitle();
        System.out.println(Title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
	}
	 public static void main(String[] args)
	{
		System.out.println("Enter the browser name");
		Scanner scan=new Scanner(System.in);
		String browser=scan.next();
		if(browser.equals("Firefox"))
		{
			FirefoxDriver f=new FirefoxDriver();
			test(f);
		}
		else if(browser.equals("Chrome"))
		{
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else
		{
			System.out.println("invalid browser");
		}
	}

}
