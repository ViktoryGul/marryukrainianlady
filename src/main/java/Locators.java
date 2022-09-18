import org.openqa.selenium.By;

public class Locators {
    //Main Page
    public static final By HOW_IT_WORKS_LINK = By.xpath("//a[@href='/content/view/how-it-works']");

    //HowItWorks
    public static final By GALLERY_LINK = By.xpath("//button[contains(@id, 'main_search_button')]");

    //Gallery
    public static final By SORT_DROP_DOWN = By.xpath("//select[contains(@id, 'sorter-select')]");

    //Registration
    public static final By REGISTRATION_BUTTON = By.cssSelector("button[id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[id='email']");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input[id='password']");
    public static final By NEXT_BUTTON = By.xpath("//button[text()='Next'][@data-action='next-page']");
    public static final By TEXT_FIELD_USER_NAME = By.cssSelector("input[id='nickname']");
    public static final By BIRTH_DATE_DROP_DAWN_DAY = By.xpath("//div[@id='daySelect']");
    public static final By BIRTH_DATE_DROP_DAWN_SELECTED_DAY = By.xpath("//ul//a[@data-value='19']");
    public static final By BIRTH_DATE_DROP_DAWN_MONTH = By.xpath("//div[@id='monthSelect']");
    public static final By BIRTH_DATE_DROP_DAWN_SELECTED_MONTH = By.xpath("//ul//a[@data-value='11'][text()='Dec']");
    public static final By BIRTH_DATE_DROP_DAWN_YEAR = By.xpath("//div[@id='yearSelect']");
    public static final By BIRTH_DATE_DROP_DAWN_SELECTED_YEAR = By.xpath("//ul//a[@data-value='2000'][text()='2000']");
    public static final By TEXT_FIELD_USER_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By CONFIRMATION_CHECKBOX = By.xpath("//input[@id='confirmation']");
    public static final By LOCATION_NAME_AUTOCOMPLETE = By.xpath("//input[@name='region_name']");
    public static final By LOCATION_NAME_SELECTED = By.xpath("//div[contains(@id, 'region_select')]//li[@country='UA'][text()='Lviv, Ukraine']");

}

