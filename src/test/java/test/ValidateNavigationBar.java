package test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.LandingPage;
import utilities.Base;

public class ValidateNavigationBar extends Base {
	public static Logger log = LogManager.getLogger(ValidateHeader.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
		log.info("driver is initialized");
		
		driver.get(prop.getProperty("URL"));
		log.info("URL sent");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("driver is closed");
	}

	@Test
	public void testNavigationBar() throws IOException {

		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNavigationBar().isDisplayed());
		log.info("Navigation bar found");

	}

}
