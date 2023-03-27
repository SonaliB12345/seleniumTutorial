package tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstProgram {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://google.com");
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> ls=driver.findElements(By.xpath("//li[@class='sbct']"));
		
		
		
		System.out.println(ls.size());

		for(WebElement abc: ls)
		{
			String listValue =abc.getText();
			if(listValue.contains("selenium"))
			{
			System.out.println(listValue);
			
			}	
		
		}
		
		
		//driver.quit();
	}

}
