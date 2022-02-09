package com.petersburg.tournaments;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

@SpringBootTest
class TournamentsApplicationTests {
	public WebDriver driver;

	@Test
	void contextLoads() {
	}

	@Test
	public void firefoxSession() {
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.quit();
	}

	@Test
	public void chromeSession() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.quit();
	}


}
