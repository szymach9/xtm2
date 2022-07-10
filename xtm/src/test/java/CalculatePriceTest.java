import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CalculatorPage;
import pages.HomePage;

public class CalculatePriceTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://xtm.cloud/");
    }

    @Test
    public void calculatePrice() {
        HomePage homePage = new HomePage(driver );
        homePage.acceptCookies();
        homePage.selectPricingPage();
        homePage.openCalculatorTab();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.switchToFrame();
        calculatorPage.selectAccountType();
        calculatorPage.selectDuration();
        calculatorPage.selectNumberOfUsers();

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(calculatorPage.totalCostValue()).isEqualTo("£1065,00");
        calculatorPage.EurCost();
        softAssertions.assertThat(calculatorPage.totalCostValue()).isEqualTo("€1,214.10");
        calculatorPage.UsdCost();
        softAssertions.assertThat(calculatorPage.totalCostValue()).isEqualTo("$1,533.60");

        softAssertions.assertAll();
    }

    @After
    public void tearDown() { driver.quit(); }
}
