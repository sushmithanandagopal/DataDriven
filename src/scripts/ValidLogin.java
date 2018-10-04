package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import generics.Auto_Constant;
import generics.Excel;

public class ValidLogin implements Auto_Constant{
	static
	{
	System.setProperty(key, value);
	}
	public static void main(String[] args) 
	{
		String us=Excel.details(excelpath,"sheet1",2,1);
		String pswd=Excel.details(excelpath,"sheet1",2,2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(us);
        driver.findElement(By.name("pass")).sendKeys(pswd);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        String u=driver.getCurrentUrl();
        System.out.println(u);
        if(u.equals("https://www.facebook.com/"))
        {
			System.out.println("pass..home page is displayed");
        }
        else
	{
		System.out.println("fail..home page is not displayed");
	}	
	driver.close();	
	
		
		
	}

}
