package propertyfile;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HMStableretrieving {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		//to write the x-path for admin login first try with click here then go for static element and then write it to find them
		driver.findElement(By.xpath("//h3[text()='Admin Login']/ancestor::div[@class='listview_1_of_3 images_1_of_3']//a[text()='Click Here']")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()='Main Navigation']/ancestor::div[@class='sidebar-container perfect-scrollbar ps-container ps-active-y']//span[text()=' Doctors ']")).click();
		driver.findElement(By.xpath("//span[text()=' Doctors ']/ancestor::li[@class='open']//span[text()=' Manage Doctors ']")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));
		List<WebElement> doctornamelist = new ArrayList<WebElement>();
		for(int i=0;i<list1.size();i++)
		{
		String headername=list1.get(i).getText();
		if(headername.equals("Doctor Name"))
			
		{
			doctornamelist=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/td["+(i+1)+"]"));
			break;
		}
		}
		for(WebElement doctor:doctornamelist)
		{
			System.out.println(doctor.getText());
		}
	}

}
