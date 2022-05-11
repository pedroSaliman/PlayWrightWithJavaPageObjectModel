package tests;

import org.testng.annotations.Test;
import pages.Home;

public class Register extends BaseTest{



    @Test
    void register()
    {
        home=new Home(page);
        reg=  home.registerbtn();
        reg.enterinfo("walled","medo","ss@gmail.com","123456789","123456789");

    }




}
