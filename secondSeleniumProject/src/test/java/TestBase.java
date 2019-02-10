import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd ;

    @BeforeMethod
 public void setUp(){
     wd = new ChromeDriver();
     wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     wd.manage().window().maximize();
        openSite("https://trello.com/") ;
 }

    protected void clickOnLoginButton(String className) {
       wd.findElement(By.className(className)).click();

    }

    protected void confirmlogin(String idConfirm) {
        wd.findElement(By.cssSelector("#login")).click();


    }

    protected void fillLoginSite() {
        wd.findElement(By.cssSelector("input[type=email]")).click();
        wd.findElement(By.cssSelector("input[type=email]")).clear();
        wd.findElement(By.cssSelector("input[type=email]")).sendKeys("elena.telran@yahoo.com");


        wd.findElement(By.cssSelector("input[type=password]")).click();
        wd.findElement(By.cssSelector("input[type=password]")).clear();
        wd.findElement(By.cssSelector("input[type=password]")).sendKeys("12345.com");



    }


    protected void openSite(String url) {
       wd.get(url);

    }
    public void login(){

        clickOnLoginButton("global-header-section-button");
        fillLoginSite();
        confirmlogin("login");
    }

    @AfterMethod

public void   tearDown  (){
wd.quit();
    }

    public boolean isUserlogged() {

        return isElementPresent(By.cssSelector("img.member-avatar"));
    }

    private boolean isElementPresent(By by) {
            try {
                wd.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }
}
