import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainTests extends BaseUI {
    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[text()='Next'][@data-action='next-page']");
    By textFieldUserName = By.cssSelector("input[id='nickname']");
    By textFieldUserPhone = By.cssSelector("input[name='data[phone]']");

    String email = "vikaTest@gmail.com";
    String password = "987456";
    String userName = "Tester";
    String userPhone = "+380987777777";


    @Test
    public void mainPageTests1() {
        driver.findElements(registrationButton).get(0).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver.findElement(textFieldUserName).sendKeys(userName);
        driver.findElement(textFieldUserPhone).sendKeys(userPhone);
    }

}
