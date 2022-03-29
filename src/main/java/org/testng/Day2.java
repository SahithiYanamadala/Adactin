package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {
	WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		}
	@BeforeMethod
	private void beforeMethod() {
		Date date =new Date();
		System.out.println(date);
		

	}
	@Parameters({"username","password"})
	@Test
	private void tc01(String s,String s1) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(s);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(s1);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		}
	@Test
	@Parameters({"location","hotels","room_type","room_nos","datepick_in","datepick_out","adult_room","child_room"})
	private void tc02(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7) {
			WebElement drglocation = driver.findElement(By.id("location"));
			Select select =new Select(drglocation);
            select.selectByVisibleText(s);	
            WebElement drghotel = driver.findElement(By.id("hotels"));
            Select select1 = new Select(drghotel);
            select1.selectByVisibleText(s1);
            WebElement btnroomtype = driver.findElement(By.id("room_type"));
            Select select2=new Select(btnroomtype);
            select2.selectByVisibleText(s2);
            WebElement drgroomno = driver.findElement(By.id("room_nos"));
            Select select3=new Select(drgroomno);
            select3.selectByVisibleText(s3);
            WebElement textdate = driver.findElement(By.id("datepick_in"));
            textdate.sendKeys(s4);
            WebElement textoutdate = driver.findElement(By.id("datepick_out"));
            textoutdate.sendKeys(s5);
            WebElement drgadultroom = driver.findElement(By.id("adult_room"));
            Select select4=new Select(drgadultroom);
            select4.selectByVisibleText(s6);
            WebElement drgchildroom = driver.findElement(By.id("child_room"));
            Select select5=new Select(drgchildroom);
            select5.selectByVisibleText(s7);
            WebElement btnsubit = driver.findElement(By.id("Submit"));
            btnsubit.click();
            }
	@Parameters()
	@Test
	private void tc03() {
		WebElement btnradio = driver.findElement(By.id("radiobutton_0"));
		btnradio.click();
		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();

	}
	@Parameters({"first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv"})
	@Test
	private void tc04(String s ,String s1,String s2,String s3,String s4,String s5,String s6,String s7) {
		WebElement txtfirstname = driver.findElement(By.id("first_name"));
		txtfirstname.sendKeys(s);
		WebElement txtlastname = driver.findElement(By.id("last_name"));
		txtlastname.sendKeys(s1);
		WebElement txtaddress = driver.findElement(By.id("address"));
		txtaddress.sendKeys(s2);
		WebElement txtccnum = driver.findElement(By.id("cc_num"));
		txtccnum.sendKeys(s3);
		WebElement drgcctype = driver.findElement(By.id("cc_type"));
		Select select = new Select(drgcctype);
		select.selectByVisibleText(s4);
		WebElement drgmonth = driver.findElement(By.id("cc_exp_month"));
		Select select1=new Select(drgmonth);
		select1.selectByVisibleText(s5);
		WebElement drgyear = driver.findElement(By.id("cc_exp_year"));
		Select select2= new Select(drgyear);
		select2.selectByVisibleText(s6);
		WebElement textcvv = driver.findElement(By.id("cc_cvv"));
		textcvv.sendKeys(s7);
		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();
		
		
		
		

	}
	
	
	
	
	
	
	}


