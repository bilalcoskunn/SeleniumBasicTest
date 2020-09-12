import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterTest {
    @Test
    public void loginPageTest()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bilal\\Desktop\\TestCaseExample\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //BaseUrl değişkenine url bilgisi atanır.
        String baseUrl = "https://www.trendyol.com/";
        //Web sitesini browserda açar
        driver.get(baseUrl);

        WebDriverWait wait = new WebDriverWait(driver,10);

        //Browser'ı maximum boyuta getirir.
        driver.manage().window().maximize();



        try {
            Thread.sleep(1000);

            //İlk açılıştaki cinsiyet seçimi yapılır.(ERKEK)
            WebElement clickGender = driver.findElement(By.xpath("//*[@id=\"popupContainer\"]/div/div[2]/a/span[1]/img"));
            clickGender.click();

            Thread.sleep(1000);

            //Hesap Açma butononuna basılır.
            WebElement clickAccount = driver.findElement(By.xpath("//*[@id=\"accountBtn\"]"));
            clickAccount.click();

            Thread.sleep(1000);

            //Eposta girilir
            WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
            email.sendKeys("your-email");

            Thread.sleep(1000);

            //Parola girilir
            WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            password.sendKeys("your-password");

            Thread.sleep(1000);

            //Giriş yap butonuna tıklanır
            WebElement loginClick = driver.findElement(By.xpath("//*[@id=\"loginSubmit\"]"));
            loginClick.click();

            Thread.sleep(3000);

            //Kampanya bildirimi seçeneğini kapatır.
            WebElement close = driver.findElement(By.xpath("//*[@id=\"Combined-Shape\"]"));
            close.click();

            Thread.sleep(1000);

            //Arama kutusuna bilgisayar yazılır.
            WebElement search = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input"));
            search.sendKeys("bilgisayar");

            Thread.sleep(1000);

            //arama butonuna basılır
            WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/i"));
            searchButton.click();

            Thread.sleep(1000);

            //ürün seçilir
            WebElement product = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/div/img"));
            product.click();

            Thread.sleep(3000);

            //ürün sepete eklenir
            WebElement addToBasket = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[5]/button[1]"));
            addToBasket.click();

            Thread.sleep(1000);

            //sepete gidilir
            WebElement goToBasket = driver.findElement(By.xpath("//*[@id=\"myBasketListItem\"]/div[1]/a/i"));
            goToBasket.click();

            Thread.sleep(1000);

            //ürün adedi artırılır
            WebElement increaseProduct = driver.findElement(By.xpath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/div[1]/div/button[2]"));
            increaseProduct.click();

            Thread.sleep(1000);

            //ürün silinir
            WebElement deleteFromBasket = driver.findElement(By.xpath("//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/button"));
            deleteFromBasket.click();

            Thread.sleep(1000);

            //Son olarak sil seçeneği seçilir
            WebElement deleteFinal = driver.findElement(By.xpath("//*[@id=\"ngdialog2\"]/div[2]/form/div/div[2]/div/div[1]/button[2]"));
            deleteFinal.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
