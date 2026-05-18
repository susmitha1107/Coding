package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Googlesearchpage;

public class googlesearch_test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        Thread.sleep(10000);
        Googlesearchpage.product(driver).click();
        Thread.sleep(10000);
        Googlesearchpage.search_text(driver).sendKeys("shirt");
        Googlesearchpage.search(driver).click();
        Actions a= new Actions(driver);
        a.moveToElement(Googlesearchpage.item(driver)).perform();
        
        
        System.out.println("success");
        

        driver.quit();
    }
}