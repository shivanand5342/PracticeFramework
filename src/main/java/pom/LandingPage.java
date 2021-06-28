package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
//Goto qaclickacademy.com then click on login 
	
	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");
	By header = By.xpath("//h2[text()='Featured Courses']");
	By navBar = By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
	
	public WebElement getNavigationBar() {
		return driver.findElement(navBar);
	}
}
