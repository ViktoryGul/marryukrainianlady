import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {
    public RegistrationForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void completeFirstPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.NEXT_BUTTON).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.findElement(Locators.TEXT_FIELD_USER_NAME).sendKeys(Data.userName);
        driver.findElement(Locators.BIRTH_DATE_DROP_DAWN_DAY).click();
        driver.findElement(Locators.BIRTH_DATE_DROP_DAWN_SELECTED_DAY).click();
        driver.findElement(Locators.BIRTH_DATE_DROP_DAWN_MONTH).click();
        driver.findElement(Locators.BIRTH_DATE_DROP_DAWN_SELECTED_MONTH).click();
        driver.findElement(Locators.BIRTH_DATE_DROP_DAWN_YEAR).click();
        driver.findElement(Locators.BIRTH_DATE_DROP_DAWN_SELECTED_YEAR).click();
        driver.findElement(Locators.TEXT_FIELD_USER_PHONE).sendKeys(Data.userPhone);
        driver.findElement(Locators.CONFIRMATION_CHECKBOX).click();
        driver.findElement(Locators.LOCATION_NAME_AUTOCOMPLETE).clear();
        driver.findElement(Locators.LOCATION_NAME_AUTOCOMPLETE).sendKeys(Data.cityLocation);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //driver.findElement(Locators.LOCATION_NAME_SELECTED).click();
    }
}
