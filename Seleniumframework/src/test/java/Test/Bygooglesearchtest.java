package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Bygoolesearchpage;

public class Bygooglesearchtest {

    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");

        Bygoolesearchpage google1 = new Bygoolesearchpage(driver);

        google1.product();
        google1.search_text("shirt");
        google1.search();
        google1.item();

        System.out.println("success");

        driver.quit();
    }
}