package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Home;

public class Contact extends BaseTest {
    Home home;
    pages.Contact cont;
    @Test
    @Parameters({"name","email","message"})
    void sendemail(@Optional("mohamed") String name,@Optional("walled@gmail.com") String email,@Optional("good") String message)
    {
        home=new Home(page);
      cont=  home.desktops();
      cont.contactinfo(name,email,message);
      Assert.assertTrue(cont.confirmmessage());
    }
}
