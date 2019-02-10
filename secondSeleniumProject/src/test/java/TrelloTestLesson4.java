import org.testng.annotations.Test;

public class TrelloTestLesson4 extends TestBase{

    @Test
    public void testLogIn(){

        clickOnLoginButton("global-header-section-button");
        fillLoginSite();
        confirmlogin("login");
    }


}

