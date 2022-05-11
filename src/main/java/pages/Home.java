package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Home extends Base{
    public Home(Page page) {
        super(page);
    }
    //Locator regbtn = page.locator("text=Register");

    private Locator searchinput = page.locator("input[id ^='small']");
    private Locator maclink=page.locator("ul[id='ui-id-1']>li:nth-of-type(1)>a");
    private Locator selec=page.locator("#customerCurrency");
    private Locator contact=  page.locator("text=Contact us");

    public Contact desktops()
    {
        contact.click();
        return new Contact(page);
    }
    public void select(String option){
        selec.selectOption(option);
    }
    public ProductPage search(String product)
    {
        searchinput.fill(product);
        maclink.click();
        return new ProductPage(page);
    }








    public RegistrationPage registerbtn(){
        page.locator(".ico-register").click();
        return new RegistrationPage(page);

    }



//    String email = "#Email";
//    String pass= "#Password";
//    String btn="text=Log in";
//    public void enter()
//    {
//        page.locator(email).fill("");
//        page.locator(pass).fill("");
//        page.locator(btn).click();
//    }
}
