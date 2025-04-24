package com.anhtester.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUIKeywords {
    private WebDriver driver;

    public WebUIKeywords() {
        // Thiết lập WebDriver, ví dụ ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    // Từ khóa mở trình duyệt và truy cập URL
    public void openBrowserToURL(String url) {
        driver.get(url);
    }

    // Từ khóa nhấp chuột vào phần tử
    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Từ khóa nhập văn bản vào trường input
    public void inputText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    // Đóng trình duyệt
    public void closeBrowser() {
        driver.quit();
    }
}
