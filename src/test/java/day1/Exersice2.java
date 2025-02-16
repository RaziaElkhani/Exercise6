package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exersice2 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp("edge");

		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement RegisterLink = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a"));
		RegisterLink.click();
		Thread.sleep(3000);

		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Razia");

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Elkhani");
		Thread.sleep(3000);
		WebElement phonNumber = driver.findElement(By.name("phone"));
		phonNumber.sendKeys("5109883381");

		WebElement email = driver.findElement(By.name("userName"));
		email.sendKeys("elkhaniRazia@gmail.com");
		Thread.sleep(3000);

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("5100 dr");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Tracy");

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("CA");

		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("45678");

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Razia");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("449988");
		password.clear();
		password.sendKeys("889988");

		WebElement conPassword = driver.findElement(By.name("confirmPassword"));
		conPassword.sendKeys("889988");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);
		WebElement confirmationText = driver.findElement(By.cssSelector(
				"body > div:nth-child(6) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(2) > font"));
		String massege = confirmationText.getText();
		if (massege.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		tearDown();
	}
}
