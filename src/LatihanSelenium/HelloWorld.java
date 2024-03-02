package LatihanSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HelloWorld {
    public static void main(String[] args) {
        // panggil webdriver
        callWebdriver();

        //click kawal aminn
        WebElement kawalAmin = test.findElement(By.xpath("/html/body/div[1]/nav/div/a[1]"));
        kawalAmin.click();

        //tunggu
        WebDriverWait wait = new WebDriverWait(test, Duration.ofSeconds(5));

        //click fakta
        WebElement fakta = test.findElement(By.xpath("/html/body/div[1]/nav/div/a[2]"));
        fakta.click();
    }

    private static void callWebdriver() {
        System.setProperty("webdriver.chrome.driver", "supportfiles/driver/chromedriver.exe");
        WebDriver test = new ChromeDriver();
        test.get("https://aminajadulu.com/");
    }

}
