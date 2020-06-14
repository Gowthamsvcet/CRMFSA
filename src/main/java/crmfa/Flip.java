package crmfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flip {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse JS Project\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Login')]/parent::button")));
			
			//WebElement user = driver.findElement(By.xpath("//span[contains(text(), 'Please enter valid Email ID/Mobile number')]/following::input"));
			
			
			WebElement user = driver.findElement(By.xpath("//span[contains(text(),'Enter Email/Mobile number')]/preceding::input [1]"));
			WebElement pass = driver.findElement(By.xpath("//span[@class=\"s-YM1W\"]/following::input"));
			//js.executeScript("arguments[0].value='8148901684';", user);
			//js.executeScript("arguments[0].value='azees';", pass);
			user.sendKeys("8148901684");
			pass.sendKeys("azees");
			driver.findElement(By.xpath("//span[contains(text(),'Login')]/parent::button")).click();
			
			
			/*Thread.sleep(5000);
			//WebDriverWait wait1 = new WebDriverWait(driver,10);
			//wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Cart\"]")));
			driver.findElement(By.xpath("//span[text()=\"Cart\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class=\"_1nWa4x\"]")).click();
			Thread.sleep(3000);
			WebElement Pin = driver.findElement(By.xpath("//input[@placeholder=\"Enter delivery pincode\"]"));
			Pin.sendKeys("600079");
			driver.findElement(By.xpath("//span[text()=\"Check\"]")).click();
			driver.findElement(By.xpath("//a[text()=\"Thamizh Atruppadai\"]")).click();
			try
			{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Scrol = driver.findElement(By.xpath("//a[text()=\"Orient Electric Ecotech Plus 1200 mm BLDC Motor with Remote 3 Blade Ceiling Fan\"]"));
			js.executeScript("arguments[0].scrollIntoVeiw();", Scrol);
			Scrol.click();
			}
			
			catch(JavascriptException a) {
				
				System.out.println("error of javascript" +a );
				
			}
			
			//Scrol.sendKeys("600079");
			WebDriverWait wait1 = new WebDriverWait(driver,10);
			wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()=\"Gowtham\"]")));*/ 
			
			
			//(By.xpath("")));
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			WebElement Mous = driver.findElement(By.xpath("//div[text()=\"Gowtham\"]"));
			action.moveToElement(Mous).click();
			Thread.sleep(3000);
			WebElement SubMouse =driver.findElement(By.xpath("//div[text()=\"My Profile\"]"));
			action.moveToElement(SubMouse).click();
			action.build().perform();
		
			
			
		
			}
		catch(Exception e) {
			System.out.println("here is error" +e);
		}


	}

}
