//xử lý logic chung cho tất cả Page
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    // thêm các hàm waitUntilVisible, scrollTo, isDisplayed...
}
