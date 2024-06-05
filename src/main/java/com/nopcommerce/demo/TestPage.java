package com.nopcommerce.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.quit();
    }
}
