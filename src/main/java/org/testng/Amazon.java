package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver driver ;
	@DataProvider(name="test data")
	private Object[][] getData() {
		return new Object[][] {{"iphone"},{"samsung"},{"applelaptop"},{"applewatch"},{"fossilwatch"},{"earrings"},{"ladiesjeans"},{"ladiesdress"},{"pen"},{"nailpolish"}};
		
		}
		@BeforeMethod
		private void beforeMethod() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			

		}
	@Test(dataProvider="test data")
	private void tc01(String s) {
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys(s);
		WebElement btnclick = driver.findElement(By.id("nav-search-submit-button"));
		btnclick.click();
		
		

	}
	
		
		
		

	}
	


	



	


