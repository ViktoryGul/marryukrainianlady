import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI {
    By signInButton = By.xpath("//a[@id='btn_log']");
    By textFieldEmail = By.xpath("//input[@id='email']");
    By textFieldPassword = By.xpath("//input[@id='password']");
    By confirmSignInBtn = By.xpath("//button[contains(text(),'Sign in')]");

    String email = "vikaTest@gmail.com";
    String password = "987456";

    @Test
    public void signInPageTests1() {
        driver.findElement(signInButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(confirmSignInBtn).click();
    }

}
