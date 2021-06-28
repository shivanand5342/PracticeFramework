package test;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.*;
import utilities.Base;

public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
		log.info("driver is initialized");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("driver is closed");
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String un, String pw, String text) {
		driver.get(prop.getProperty("URL"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		log.debug("Login selected");

		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(un);
		log.debug("Username typed");
		
		lp.getPassword().sendKeys(pw);
		log.debug("Password typed");
		
		lp.getLogin().click();
		log.debug("Login button selected");
		System.out.println(text);
	}

	@DataProvider
	public Object[][] getData() {
		// row stands for how many different data type tests should run
		// columns stands for how many values per each test
		Object[][] data = new Object[3][3];
		data[0][0] = "abc";
		data[0][1] = "123";
		data[0][2] = "1st credentials";

		data[1][0] = "xyz";
		data[1][1] = "321";
		data[1][2] = "2nd credentials";

		data[2][0] = "pqr";
		data[2][1] = "456";
		data[2][2] = "3rd credentials";
		return data;
	}
}
