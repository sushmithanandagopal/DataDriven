package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import generics.Auto_Constant;
import generics.Excel;

public class Logout implements Auto_Constant{
	static
	{
	System.setProperty(key, value);
	}
	public static void main(String[] args) 
	{
		String us=Excel.details(excelpath,"sheet1",2,1);
		String pswd=Excel.details(excelpath,"sheet1",2,2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");

		driver.findElement(By.id("login-email")).sendKeys(us);
		driver.findElement(By.id("login-password")).sendKeys(pswd);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("jobs-tab-icon")).click();
		 WebElement d = driver.findElement(By.id("nav-settings__dropdown-options"));
		 Actions b= new Actions(driver);
		 b.moveToElement(d).click();
		driver.close();
		
		
	}

}
