package tests;



import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Api {
    Playwright play;
    APIRequestContext api;
    @Test
    void api()
    {
        play= Playwright.create();
      api=  play.request().newContext(new APIRequest.NewContextOptions().setBaseURL("https://reqres.in/"));
     int resp=api.get("/api/users?page=2").status();
        System.out.println(resp);
        Assert.assertEquals(200,resp);

    }
}
