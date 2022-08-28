import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.REGISTRATION_BUTTON));
        driver.findElements(Locators.REGISTRATION_BUTTON).get(0).click();
    }
}
