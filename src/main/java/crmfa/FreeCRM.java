package crmfa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse JS Project\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.get("https://freecrm.co.in/");
         String div = driver.getTitle();
         System.out.println(div);
     
        try {
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //WebElement gow = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
            
             WebElement gow = driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
             gow.click();
            
            //WebDriverWait wait = new WebDriverWait(driver, 5);
            //wait.until(ExpectedConditions.(By.name("email")));
            
            String Fir = driver.getTitle();
            System.out.println(Fir);
        	 // Some code
        	
            WebElement Email =driver.findElement(By.xpath("//input[@name=\"email\"]"));
            //.sendKeys("string","Gowtham.studpro@gmail.com");
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].value='Gowtham.studpro@gmail.com';", Email);
            //Email.sendKeys("Gowtham.studpro@gmail.com");
    
            WebElement pass =driver.findElement(By.xpath("//input[@name=\"password\"]"));
            pass.sendKeys("string","Aravind@24");
            //JavascriptExecutor jse1 = (JavascriptExecutor)driver;
            //jse1.executeScript("arguments[0].value='Aravind@24';", pass);
    
            driver.findElement(By.xpath("//a[contains(text(),'Forgot your password')]")).click();
            //driver.findElement(By.cssSelector("input#email")).sendKeys("Gowtham");
            driver.findElement(By.xpath("//a[contains(text(),'Got an account? Log in here')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
            WebElement browse =  driver.findElement(By.xpath("//input[@id='terms']"));
            browse.click();
        	} 
        
        catch (WebDriverException e) {
        	 // Code for Handling the exception\
        	System.out.println("here textbox error");
        	}

	}

}
