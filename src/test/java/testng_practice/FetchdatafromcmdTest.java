package testng_practice;

import org.testng.annotations.Test;
import generalUtility.WebdriverUtility;

public class FetchdatafromcmdTest {
	@Test
	public void step1Test() {
		String browser = System.getProperty("b");
		browser="chrome";
		String url = System.getProperty("u");
		url="https:gmail.com";
		System.out.println("browser name is " + browser);
		System.out.println("specified url is " + url);
		WebdriverUtility webutility = new WebdriverUtility();
		webutility.starttheapplication(browser, 10, url);
	}
}

