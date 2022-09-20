package practiceutility;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import generalUtility.WebdriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytripbyjs {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebdriverUtility wb = new WebdriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		wb.jsInitialization(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.Launchapplication("https://www.makemytrip.com/");
		wb.clickUsingjs(driver.findElement(By.xpath("//span[@class='langCardClose']")));
		wb.clickUsingjs(driver.findElement(By.xpath("//span[text()='From']")));
		wb.sendkeysUsingjs(driver.findElement(By.xpath("//input[@placeholder='From']")), "Hyderabad");
		wb.clickUsingjs(driver.findElement(By.xpath("//div[.='HYD']")));
		wb.clickUsingjs(driver.findElement(By.xpath("//span[text()='To']")));
		wb.sendkeysUsingjs(driver.findElement(By.xpath("//input[@placeholder='To']")), "Bangalore");
		wb.clickUsingjs(driver.findElement(By.xpath("//div[.='BLR']")));
		wb.clickUsingjs(driver.findElement(By.xpath("//a[text()='Search']")));
		driver.close();
	}
}
