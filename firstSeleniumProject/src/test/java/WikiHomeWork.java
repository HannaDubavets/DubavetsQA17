import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikiHomeWork {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
       wd = new ChromeDriver();
       wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @Test
    public void WikiTest(){
        wd.get("https://www.wikipedia.org/");


        wd.findElement(By.id("js-link-box-ru")).click();
        wd.findElement(By.id("pt-login")).click();


        //login to the wiki

        wd.findElement(By.name("wpName")).click();
        wd.findElement(By.name("wpName")).clear();
        wd.findElement(By.name("wpName")).sendKeys("HannaDubavets");
        wd.findElement(By.name("wpPassword")).click();
        wd.findElement(By.name("wpPassword")).clear();
        wd.findElement(By.name("wpPassword")).sendKeys("chirurgo999");
        wd.findElement(By.id("wpLoginAttempt")).click();



    }
    @AfterMethod
    public void tearDown(){
        //wd.quit();
    }
}
