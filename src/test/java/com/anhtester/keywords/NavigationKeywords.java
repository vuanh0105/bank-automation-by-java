package com.anhtester.keywords;

import org.openqa.selenium.By;

public class NavigationKeywords extends WebUIKeywords {

    // Từ khóa di chuyển đến trang khác
    public void navigateToPage(String url) {
        openBrowserToURL(url);
    }

    // Từ khóa điều hướng qua menu
    public void navigateThroughMenu(By menuLocator) {
        clickElement(menuLocator);
    }
}
