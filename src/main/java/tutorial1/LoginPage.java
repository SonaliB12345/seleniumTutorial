package tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("sonalibhosale2725@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Scogmento@27");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.quit();
	}

}
