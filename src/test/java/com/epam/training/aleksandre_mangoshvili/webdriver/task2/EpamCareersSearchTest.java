package com.epam.training.aleksandre_mangoshvili.webdriver.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EpamCareersSearchTest {
    WebDriver driver;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.epam.com/");
    }

    @Test
    void testingEpamCareersTab(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }



}
