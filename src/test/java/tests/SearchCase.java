package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Home;
import pages.ProductPage;

public class SearchCase extends BaseTest{

    Home home;
    ProductPage prod;
    WishlinkPage wish;
    @Test
    @Parameters({"product"})
    void search(@Optional("mac") String product){
        home=new Home(page);
        home.search(product);
        prod=new ProductPage(page);
        prod.wishlist();
page.pause();



    }

}
