package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "D:\\chromeserver\\chromedriver_win32 ver2\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.booking.com");
		WebElement searchBook = driver.findElement(By.xpath(".//input[@placeholder=\"Куда вы хотите поехать?\"]"));
		searchBook.sendKeys("Москва");

		WebElement clickPeople = driver.findElement(By.xpath(".//span[@class=\"xp__guests__count\"]"));
		clickPeople.click();
		
		WebElement clickCountOfPeople = driver.findElement(By.xpath(".//select[@name = \"group_adults\"]"));
		clickCountOfPeople.click();
		
		
	}

}
