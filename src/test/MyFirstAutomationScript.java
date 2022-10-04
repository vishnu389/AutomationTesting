package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VPENIGIL\\Desktop\\selinium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://adactinhotelapp.com");
        driver.findElement(By.id("username")).sendKeys("vishnu96812");
        driver.findElement(By.id("password")).sendKeys("2XV76W");
        driver.findElement(By.id("login")).click();
        String actualTitle=driver.getTitle();
        if(actualTitle.equalsIgnoreCase("Adactin.com - Search Hotel"))
        {
        	System.out.println("test passed");
        }
	}

}
