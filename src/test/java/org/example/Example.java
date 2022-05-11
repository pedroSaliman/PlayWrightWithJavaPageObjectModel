package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();

            // Open new page
            Page page = context.newPage();

            // Go to https://demo.nopcommerce.com/
            page.navigate("https://demo.nopcommerce.com/");



            // Click text=Computers >> nth=0

            // Click text=Contact us
            page.locator("text=Contact us").click();
            // assertThat(page).hasURL("https://demo.nopcommerce.com/contactus");
        }
    }
}