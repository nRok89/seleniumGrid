package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserRuner {

    @Test
    public void firefoxTest(){

        WebDriver firefox = new FirefoxDriver();

        firefox.get("https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params/5.11.0");

    }


    @Test
    public void chromeTest(){

        WebDriver firefox = new ChromeDriver();

        firefox.get("https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params/5.11.0");

    }

}
