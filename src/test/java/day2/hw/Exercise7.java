package day2.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise7 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement orgPage = driver.findElement(By.xpath("//a[contains(@href,'org/openqa/selenium/package-summary')]"));
		orgPage.click();
		WebElement alret = driver.findElement(By.xpath("//*[@id=\"class-summary.tabpanel\"]"));

		String text = alret.getText();
		System.out.println(text);
		alret.click();
		Thread.sleep(2000);
		WebElement interfaceAlert=  driver.findElement(By.xpath("/html/body/div[1]/div/main/div/h1"));
		 String interText= interfaceAlert.getText();
		 System.out.println(interText);
		 if (text.equalsIgnoreCase(interText)) {
			 System.out.println("TESTCASE PASSED");
		 }else {
			 System.out.println("TESTCASE FAILED");
		 }
		driver.navigate().back();
		Thread.sleep(2000);
		 
		 WebElement chromeClick = driver.findElement(By.xpath("//*[@id=\"all-packages-table\"]/div[2]/div[19]"));
		 chromeClick.click();
		 
		 WebElement chromeDriv=driver.findElement(By.xpath("//*[@id=\"class-summary\"]/div[2]/div[7]/a"));
		 chromeDriv.click();
		 Thread.sleep(2000);
		 WebElement get=driver.findElement(By.xpath("/html/body/div[1]/div/main/div[1]/h1"));
		 String cText =get.getText();
		 System.out.println(cText);
		 if (cText.endsWith("Class ChromeDriver")) {
			 System.out.println("TESTCASE PASSED");
		 }else {
			 System.out.println("TESTCASE Failed");
		 }
		 
		tearDown();
	}

}
