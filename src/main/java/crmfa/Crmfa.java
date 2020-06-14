package crmfa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crmfa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String month="December, 2020";
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse JS Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//WebElement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		try {
			String P = driver.getTitle();
			System.out.println(P);
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.titleIs("Leaftaps - TestLeaf Automation Platform"));
			
			
			//Sendkeys using
			/*WebElement ele = driver.findElement(By.cssSelector("input#username"));
			ele.sendKeys("DemoSalesManager");
			
			WebElement Pass = driver.findElement(By.cssSelector("input#password"));
			Pass.sendKeys("crmsfa");*/
		
			//Javacript Executor	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement ele = driver.findElement(By.cssSelector("input#username"));
			js.executeScript("arguments[0].value='DemoSalesManager';", ele);
			WebElement Pass = driver.findElement(By.cssSelector("input#password"));
			js.executeScript("arguments[0].value='crmsfa';", Pass);
			//Button Element Locator
			WebElement button = driver.findElement(By.cssSelector("input.decorativeSubmit"));
			button.click();
			
			//String PA = driver.getTitle();
			//System.out.printf("chrome passed inside",PA);
			driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
			driver.findElement(By.xpath("//a[contains(text(), 'Opportunities')]")).click();
			//driver.findElement(By.id("ext-gen55")).click();
			//driver.findElement(By.name("accountName")).sendKeys("Gowtham");
			driver.findElement(By.xpath("//a[contains(text(), 'My Opportunities')]")).click();
			driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
			driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowtham");
			WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select mydrop = new Select(dropdown);
			mydrop.selectByVisibleText("Website");
			driver.findElement(By.xpath("//img[@alt=\"Lookup\"]")).click();
			String mainwindow = driver.getWindowHandle();
			System.out.printf( "Here parent Window Id", mainwindow);
			 Set <String> set = driver.getWindowHandles();
			 /*Iterator<String> IA = set.iterator();
			 while (IA.hasNext()) {
				 String childwindow = IA.next();
				 if(!mainwindow.equals(childwindow)) {
					  driver.switchTo().window(childwindow);
					  driver.findElement(By.xpath("//span[text()=\"Phone\"]")).click();
					  System.out.println(childwindow);
					  driver.findElement(By.xpath("//a[text()=\"accountlimit100\"]")).click();
					  
					  //driver.close();
					  }
			 }
					 driver.switchTo().window(mainwindow);*/
					 
			 ArrayList<String> tabs = new ArrayList<String>(set);
			 {
			    driver.switchTo().window(tabs.get(1));
			    driver.findElement(By.xpath("//span[text()=\"Phone\"]")).click();
				//System.out.println();
				driver.findElement(By.xpath("//a[text()=\"accountlimit100\"]")).click();
				
				driver.switchTo().window(mainwindow);
			 }
		    driver.findElement(By.xpath("//img[@id=\"createLeadForm_birthDate-button\"]")).click();
					 
			while(true) {
				String Cale = driver.findElement(By.xpath("//td[@class=\"title\"]")).getText();
				File Screen	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(Screen, new File("./Screenshot/Crmfa.png"));
				System.out.println(Cale);
				if(Cale.equals(month)) {
					break;
				}
				else {
					driver.findElement(By.xpath("//table/thead/tr[2]/td[4]")).click();
				     }
			 }
			driver.findElement(By.xpath("//td[text()=\"22\"]")).click();
			
			File Screen	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screen, new File("./Screenshot/Crmfa.png"));
			
			}
		catch(WebDriverException e)
		{
			//some Code	
			System.out.println("here is error");
		}
		
		//driver.close();
		

	}

}
