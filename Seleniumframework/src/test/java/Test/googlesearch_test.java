package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Googlesearchpage;

public class googlesearch_test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        Thread.sleep(1000);
        Googlesearchpage.product(driver).click();
        Googlesearchpage.search_text(driver).sendKeys("shirt");
        Googlesearchpage.search(driver).click();
        System.out.println("success");
        

        driver.quit();
    }
}