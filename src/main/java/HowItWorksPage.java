import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowItWorksPage extends BaseActions {

    public HowItWorksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickGalleryLink() {
        driver.findElement(Locators.GALLERY_LINK).click();
    }
}
