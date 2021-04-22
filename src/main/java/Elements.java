import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    public static WebDriver driver;

    public Elements(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement webSiteName() {
        return driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[1]/div/div/a"));
    }

    public WebElement login() {
        return driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]"));
    }
    public WebElement loginLink() {
        return driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a"));
    }

    public WebElement userName() {
        return driver.findElement(By.id("L-UserNameField"));
    }

    public WebElement password() {
        return driver.findElement(By.id("L-PasswordField"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.id("gg-login-enter"));
    }

    public WebElement searchBox() {
        return driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input"));
    }

    public WebElement searchButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
    }

    public WebElement secondPage() {
        return driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a"));
    }
    public WebElement secondPageCurrentLink(){
        return driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[4]/ul/li[3]/a"));
    }

    public WebElement chooseProduct () {
        return driver.findElement(By.id("product_id_611029068"));
    }
    public WebElement priceOfProduct(){
        return driver.findElement(By.id("sp-price-highPrice"));
    }

    public WebElement productAddToBasket(){
        return driver.findElement(By.id("add-to-basket"));
    }
    public WebElement orderCheck() {
        return driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[4]/div[1]/div/div/div/div/ul/li[1]/a"));
    }
    public WebElement goToBasket(){
        return driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[3]/div/a"));
    }
    public WebElement basketPriceOfProduct(){
        return driver.findElement(By.xpath("//*[@id=\"cart-item-470446293\"]/div[1]/div[5]/div[1]/div[1]"));
    }



}
