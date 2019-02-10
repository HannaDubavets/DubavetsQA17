import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondotions(){
        if(!isUserlogged()){
            login();
        }
    }


    @Test
    public void testLogout(){
        clickOnAvatar();
        clickOnLogOutButton();

        Assert.assertFalse(isUserlogged());

    }

    private void clickOnAvatar() {
        wd.findElement(By.cssSelector("img.member-avatar")).click();
    }

    private void clickOnLogOutButton() {
        wd.findElement(By.cssSelector("a.js-logout")).click();


    }
}
