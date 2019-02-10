import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowser {
    WebDriver wd = new ChromeDriver();

    @BeforeClass
public void setUp(){
        setUpBefore();
    }

    private void setUpBefore() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void chromeBrowserTest(){
        wd.get("http://google.com");

        type();


    }

    private void type() {
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();

        wd.findElement(By.name("q")).sendKeys("selenium");
    }


    @AfterClass
    public void tearDow() throws InterruptedException {
      //Thread.sleep(3000);
      //  wd.quit();
}
}

