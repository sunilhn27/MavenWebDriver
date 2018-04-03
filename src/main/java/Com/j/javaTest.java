package Com.j;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaTest {

	@Test
	public void set() {
		//
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		d.manage().window().maximize();
	}
}
