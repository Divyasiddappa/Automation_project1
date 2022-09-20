package propertyfile;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderpopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String requireddate = "23";
		String requiredmonth = "january";
		String requiredyear = "2024";

		int requiredmonthinnum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(requiredmonth)
				.get(ChronoField.MONTH_OF_YEAR);

		int requiredyearinnum = Integer.parseInt(requiredyear);

		driver.get("https://testleaf.herokuapp.com/pages/Calendar.html");
		driver.findElement(By.id("datepicker")).click();
		String dateText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(dateText);

		String[] str = dateText.split("");
		String actualmonth = str[0];
		String actualyear = str[1];
		int actualmonthinnum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(requiredmonth)
				.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(actualmonthinnum);
		int actualyearinnum = Integer.parseInt(actualyear);
		while (requiredmonthinnum > actualmonthinnum || requiredyearinnum > actualyearinnum) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			dateText = driver.findElement(By.xpath("")).getText();
			str = dateText.split("");
			actualmonth = str[0];
			actualyear = str[1];
			actualmonthinnum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualmonth)
					.get(ChronoField.MONTH_OF_YEAR);
			actualyearinnum = Integer.parseInt(actualyear);
		}
		while (requiredmonthinnum < actualmonthinnum || requiredyearinnum < actualyearinnum) {
			driver.findElement(By.xpath("")).click();
			dateText = driver.findElement(By.xpath("")).getText();
			str = dateText.split("");
			actualmonth = str[0];
			actualyear = str[1];
			actualmonthinnum = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(actualmonth)
					.get(ChronoField.MONTH_OF_YEAR);
			actualyearinnum = Integer.parseInt(actualyear);
		}

		driver.findElement(By.xpath("")).click();
	}
}
