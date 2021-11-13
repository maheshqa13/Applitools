import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tools1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mahes\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.applitools.com/app.html");
			Thread.sleep(3000);
//			List<WebElement> tabcon = driver.findElements(By.xpath("//a"));
//			
//			for(WebElement tab1:tabcon)
//			{
//				for(int i=0;i<=tabcon.size();i++)
//				{
//					tab1.click();
//					Thread.sleep(3000);
//					}
//			}
	
			driver.findElement(By.xpath("//div[@class='os-icon os-icon-layout']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Debit cards')]")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='os-icon os-icon-package']")).click();
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("(//div[@class='os-icon os-icon-package'])[2]")).click();
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("//div[@class='element-search autosuggest-search-activator']//input")).sendKeys("hi");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
			Thread.sleep(3000);

	}
}
