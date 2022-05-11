package tests;

import org.testng.annotations.*;
import pages.Home;
import pages.RegistrationPage;

public class BaseTest extends Base{
    Home home;
    RegistrationPage reg;
    @BeforeTest
    @Parameters({ "url", "browserName" , "headless"})
    void setup(@Optional("https://demo.nopcommerce.com/")String url,@Optional("chrome")String browserName,@Optional("false")String headless)

    {
        launchPlaywright(browserName, headless);
        launchApplication(url);

    }








    @AfterTest
    void close()
    {
        closePlaywright();
    }
}
