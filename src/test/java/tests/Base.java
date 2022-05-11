package tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.ColorScheme;
import com.microsoft.playwright.options.WaitUntilState;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
    Playwright playwright;
    BrowserType browserType;
    Browser browser;
    BrowserContext context;
    public Page page;

    public void launchPlaywright(String browserName, String headless) {
        playwright = Playwright.create();
        if (browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("msedge")
                || browserName.equalsIgnoreCase("chromium")) {
            browserType = playwright.chromium();
        } else if (browserName.equalsIgnoreCase("webkit")) {
            browserType = playwright.webkit();
        }else if (browserName.equalsIgnoreCase("firefox")){
            browserType=playwright.firefox();
        }
        if (headless.equalsIgnoreCase("true")) {
            browser = browserType.launch(new BrowserType.LaunchOptions().setChannel(browserName).setHeadless(true));
        } else {
            browser = browserType.launch(new BrowserType.LaunchOptions().setChannel(browserName).setHeadless(false));
        }
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1280,1024));
        context.close();
        page = browser.newPage();

        // Pause on the following line.

        System.out.println("**** Project Browser Name and Version is : " + browserName + " : " + browser.version());
    }

    public void launchApplication(String url) {
        page.navigate(url, new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));
       // page.waitForSelector("[data-qa='cemaxumuwu']");
    }

    public void closePlaywright() {
        page.close();
        browser.close();
        playwright.close();
    }
}
