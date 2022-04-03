package com.petersburg.tournaments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.manage().window().maximize(); // Maximizes the window

        /**
         * Lines 29-33 opens a Chrome browser session, navigates to the USTA tournaments page
         * with "Junior (18 and Under)" pre-selected, enters "30809" in the location text box, and hits "enter."
         *
         * A list of all tournaments within 100 miles of the entered zipcode appears on screen.
         */
            driver.get("https://playtennis.usta.com/tournaments?level-category=junior");
            driver.getTitle(); // => "Google"
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
            WebElement searchBox = driver.findElement(By.name("location"));
            searchBox.sendKeys("30809" + Keys.ENTER);

        /**
         * The next section of code automates the process of selecting a tournament link,
         * finding the tournament ID, name, date, location, and cost, and enters that information into a formatted
         * spreadsheet.
         *
         * A List is created to contain the search results. An enhanced for loop automates the steps for select
         * a tournament and retrieve data for each result.
         */
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

            List<WebElement> tournamentSearchResults = driver.findElements(By.className("csa-search-result-tournament"));

            for (WebElement tournamentSearchResult : tournamentSearchResults) {
                WebElement tournamentSelectBox = driver.findElement(By.name(""));
            }



       // driver.quit(); //CLOSES BROWSER
    }
}