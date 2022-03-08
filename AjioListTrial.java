package Week3Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioListTrial {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("Wallet", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Women']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Women - Clutches & Wristlets']")).click();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'brands')]")).click();
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}

		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Wallet");
		for (WebElement webElement : bagNameList) {
			
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
