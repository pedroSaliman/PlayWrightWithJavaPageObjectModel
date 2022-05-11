package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RegistrationPage extends Base{
    public RegistrationPage(Page page) {
        super(page);
    }

    Locator gender = page.locator("#gender-male");
    Locator fname=page.locator("#FirstName");
    Locator lname=page.locator("#LastName");
    Locator email=page.locator("#Email");
    Locator password=page.locator("#Password");
    Locator confirm=page.locator("#ConfirmPassword");
    Locator btn=page.locator("button:has-text(\"Register\")");
    public void enterinfo(String thefirstname,String thelastname,String theemail,String thpassword,String theconfirm)
    {
        gender.click();
        fname.fill(thefirstname);
        lname.fill(thelastname);
        email.fill(theemail);
        password.fill(thpassword);
        confirm.fill(theconfirm);
        btn.click();
    }



}
