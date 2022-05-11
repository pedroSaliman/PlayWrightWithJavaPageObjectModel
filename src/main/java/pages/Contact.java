package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Contact extends Base{
    public Contact(Page page) {
        super(page);
    }
    private Locator name = page.locator("input[id='FullName']");
    private Locator email = page.locator("input[id='Email']");
    private Locator message = page.locator("textarea[id='Enquiry']");
    private Locator button = page.locator("'Submit'");
    public Boolean confirmmessage(){
        Boolean status= page.isVisible("div[class='result']");
        return status;

    }





    public void contactinfo(String thename,String theemail,String themessage)
    {
        name.type(thename);
        email.type(theemail);
        message.type(themessage);
        button.click();
    }


}
