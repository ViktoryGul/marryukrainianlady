import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {
    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[text()='Next'][@data-action='next-page']");
    By textFieldUserName = By.cssSelector("input[id='nickname']");
    By birthDateDropDawnDay = By.xpath("//div[@id='daySelect']");
    By birthDateDropDawnSelectedDay = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='19']");
    By birthDateDropDawnMonth = By.xpath("//div[@id='monthSelect']");
    By birthDateDropDawnSelectedMonth = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='11'][text()='Dec']");
    By birthDateDropDawnYear = By.xpath("//div[@id='yearSelect']");
    By birthDateDropDawnSelectedYear = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='2000'][text()='2000']");
    By textFieldUserPhone = By.cssSelector("input[name='data[phone]']");
    By locationNameAutocomplete = By.xpath("//input[@name='region_name']");
    By locationNameSelected = By.xpath("//div[contains(@id, 'region_select')]//li[@country='UA'][text()='Lviv, Ukraine']");
    By confirmationCheckbox = By.xpath("//input[@id='confirmation']");

    String email = "vikaTest@gmail.com";
    String password = "987456";
    String userName = "Tester";
    String userPhone = "+380987777777";
    String cityLocation = "Lviv";


    @Test
    public void completeRegistration() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registrationButton));
        driver.findElements(registrationButton).get(0).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver.findElement(textFieldUserName).sendKeys(userName);
        driver.findElement(birthDateDropDawnDay).click();
        driver.findElement(birthDateDropDawnSelectedDay).click();
        driver.findElement(birthDateDropDawnMonth).click();
        driver.findElement(birthDateDropDawnSelectedMonth).click();
        driver.findElement(birthDateDropDawnYear).click();
        driver.findElement(birthDateDropDawnSelectedYear).click();
        driver.findElement(textFieldUserPhone).sendKeys(userPhone);
        driver.findElement(confirmationCheckbox).click();
        driver.findElement(locationNameAutocomplete).clear();
        driver.findElement(locationNameAutocomplete).sendKeys(cityLocation);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(locationNameSelected).click();

    }

}
