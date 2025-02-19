package day2.hw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement pageTitle = driver.findElement(By.xpath("//*[@id='header']"));
		String title = pageTitle.getText();
		if (title.contains("Alerts")) {
			System.out.println("Alerts");
		} else {
			System.out.println("Title is not Alerts");

		}

		WebElement AlretText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		AlretText.click();
		WebElement clickBtn = driver.findElement(By.cssSelector("button[class^='btn btn-info']"));
		clickBtn.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Razia");

		alert.accept();
		Thread.sleep(3000);

		WebElement TextHello = driver.findElement(By.id("demo1"));
		String text = TextHello.getText();

		System.out.println(text);
		if (text.contains("How are you today")) {

		}
		driver.navigate().refresh();
		WebElement alertOkCan = driver.findElement(By.xpath("//a[contains(@href, '#CancelTab')]"));
		alertOkCan.click();

		WebElement confirmBox = driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]"));
		confirmBox.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		// I had been trying for almost 4 hours on this Exercise ,and I think this is confirmation alerts that we can only accept or 
		//cancel
		WebElement pressOk =driver.findElement(By.id("demo"));
		String clickPress = pressOk.getText();
		if (clickPress.contains("You Pressed")) {
			System.out.println(clickPress);
		}
		
		tearDown();

	}

}
