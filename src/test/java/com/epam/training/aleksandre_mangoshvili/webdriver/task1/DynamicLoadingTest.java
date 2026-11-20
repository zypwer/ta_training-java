package com.epam.training.aleksandre_mangoshvili.webdriver.task1;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicLoadingTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }

    @Test
    void mightHelloWorld() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement startButton = driver.findElement(By.cssSelector("#start button"));
        startButton.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
        WebElement finalText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        assertEquals("Hello World!", finalText.getText());
    }

    @AfterEach
    void stop() {
        driver.quit();
    }
}
