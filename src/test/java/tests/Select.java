package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Home;

public class Select extends BaseTest{
    Home home;
    @Test
    @Parameters({"currency"})
    void select(@Optional("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F") String currency){
        home=new Home(page);
        home.select(currency);
    }
}
