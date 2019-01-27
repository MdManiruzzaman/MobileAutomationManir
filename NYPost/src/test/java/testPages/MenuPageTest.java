package testPages;

import homePage.MenuPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuPageTest extends MenuPage {
    MenuPage menuPage;
    @BeforeMethod
    public void initElements(){
        menuPage = PageFactory.initElements(ad, MenuPage.class);
    }
    @Test
    public void testPageSix() throws InterruptedException {
        menuPage.checkMenuPage();
    }
}