import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;



import java.util.concurrent.TimeUnit;
public class TestAutomation {
    public WebDriver driver;
    public String url;
    public Elements elm;
    public Actions actions;
    public static String email = "ulutasalkan@hotmail.com";
    public static String password = "69150000";


    @Before
    public void setupTestDriver() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://www.gittigidiyor.com";
        driver.manage().window().maximize();
    }

    @Test
    public void Run_Test() {
        //Siteye giriş yapılır.
        driver.get(url);
        System.out.println("Sayfa gidiş başarılı");
        //Üye giriş sayfasına gidilir
        elm = new Elements(driver);
        actions = new Actions(driver);
        actions.moveToElement(elm.login()).perform();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        String loginLink = elm.loginLink().getAttribute("href");
        driver.get(loginLink);

        //Kullanıcı adı ile şifre giriş yapılır.
        elm.userName().sendKeys(email);
        elm.password().sendKeys(password);
        elm.loginButton().click();
        System.out.println("Login başarılı");

        //Arama kutucuğuna veri girilir.
        elm.searchBox().sendKeys("bilgisayar");
        elm.searchButton().submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2.sayfaya yönlendirilir.
        String secondPage = elm.secondPage().getAttribute("href");
        driver.get(secondPage);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2.sayfa kontrolü sağlanır.
        String isSecondPage = elm.secondPageCurrentLink().getAttribute("class");
        if(isSecondPage.equals("current")){
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            //Ürün seçilir.
            elm.chooseProduct().click();
            //Ürün fiyatı alınır.
            String unitPrice=elm.priceOfProduct().getText();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            //Ürün Sepete eklenir
            elm.productAddToBasket().submit();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println("Sepete ekleme başarılı");
            //Sepete gidilir
            String basketPageLink=elm.goToBasket().getAttribute("href");
            driver.get(basketPageLink);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println("Sepete gidiş başarılı");
            //Ürün sepetteki değeri alınır
            String basketPrice=elm.basketPriceOfProduct().getText();
            //Sepetteki değer ile ürünün liste değeri kıyaslanır
            if(unitPrice.equals(basketPrice)){

            }
        }
    }

    @After
    public void exitDriver(){
        driver.quit();
    }
}
